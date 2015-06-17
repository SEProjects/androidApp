package de.fh_muenster.autovermietungandroid;

import android.util.Log;

import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;

import de.fh_muenster.autovermietung.FSA;
import de.fh_muenster.autovermietung.Kunde;
import de.fh_muenster.autovermietung.OnlineService;
import de.fh_muenster.autovermietung.PLZ;
import de.fh_muenster.autovermietung.exceptions.InvalidLoginException;
import de.fh_muenster.autovermietung.exceptions.NoSessionException;

/**
 * Created by marian on 17.06.15.
 */
public class OnlineServiceImpl implements OnlineService {
	private static final String NAMESPACE = "http://onlineSystem.autovermietung.de/";
	private static final String URL = "http://192.168.178.62:8080/Autovermietung_OnlineSystem/OnlineIntegration";
	//Tag bei Xbank nach schauen
	private static final String TAG = OnlineServiceImpl.class.getName();
	private int sessionId;
	private ArrayList<String> param = new ArrayList<String>();

	@Override
	public Kunde login(String email, String password) throws InvalidLoginException {
		Kunde result = null;
		String METHOD_NAME = "login";
		SoapObject response = null;
		this.param.clear();
		this.param.add("email");
		this.param.add("password");
		try {
			response = executeSoapAction(METHOD_NAME, email, password);
			Log.d(TAG, response.toString());
			this.sessionId = Integer.parseInt(response.getPrimitivePropertySafelyAsString("session"));

			if (sessionId != 0) {
				this.param.clear();
				param.add("Sessionid");
				param.add("Kundeemail");
				response = executeSoapAction("getKunde", this.sessionId, email);
				result = new Kunde(email,password);
				result.setKvorname(response.getPrimitivePropertySafelyAsString("kvorname"));
				result.setKnachname(response.getPrimitivePropertySafelyAsString("kvorname"));
				result.setFsnummer(response.getPrimitivePropertySafelyAsString("fsnummer"));
				result.setPan(response.getPrimitivePropertySafelyAsString("pan"));
				result.setStrasse(response.getPrimitivePropertySafelyAsString("straße"));
				result.setSaf(Boolean.parseBoolean(response.getPrimitivePropertySafelyAsString("saf")));
				result.setAdmin(Boolean.parseBoolean(response.getPrimitivePropertySafelyAsString("admin")));
				result.setFsa(new FSA(response.getPrimitivePropertySafelyAsString("fsaName")));
				result.setKplz(new PLZ(response.getPrimitivePropertySafelyAsString("plz"), response.getPrimitivePropertySafelyAsString("wohnort")));
				return result;
			}
			else {
				throw new InvalidLoginException("Login not successful!");
			}
		} catch (SoapFault e) {
			throw new InvalidLoginException(e.getMessage());
		}
	}

	@Override
	public void logout() throws NoSessionException {
		Log.d(TAG,"logout called.");
		String METHOD_NAME = "logout";
		this.param.clear();
		this.param.add("sessionId");
		try {
			SoapObject response = executeSoapAction(METHOD_NAME, sessionId);
			Log.d(TAG, response.toString());
		} catch (SoapFault e) {
			throw new NoSessionException(e.getMessage());
		}
	}
	private SoapObject executeSoapAction(String methodName, Object... args) throws SoapFault {
		Object result = null;

		SoapObject request = new SoapObject(NAMESPACE, methodName);

		for(int i = 0; i < this.param.size();i++) {
			request.addProperty(this.param.get(i), args[i]);
		}
	    /* Next create a SOAP envelop. Use the SoapSerializationEnvelope class, which extends the SoapEnvelop class, with support for SOAP
	     * Serialization format, which represents the structure of a SOAP serialized message. The main advantage of SOAP serialization is portability.
	     * The constant SoapEnvelope.VER11 indicates SOAP Version 1.1, which is default for a JAX-WS webservice endpoint under JBoss.
	     */
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

	    /* Assign the SoapObject request object to the envelop as the outbound message for the SOAP method call. */
		envelope.setOutputSoapObject(request);

	    /* Create a org.ksoap2.transport.HttpTransportSE object that represents a J2SE based HttpTransport layer. HttpTransportSE extends
	     * the org.ksoap2.transport.Transport class, which encapsulates the serialization and deserialization of SOAP messages.
	     */
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
	        /* Make the soap call using the SOAP_ACTION and the soap envelop. */
			List<HeaderProperty> reqHeaders = null;

			@SuppressWarnings({"unused", "unchecked"})
			//List<HeaderProperty> respHeaders = androidHttpTransport.call(NAMESPACE + methodName, envelope, reqHeaders);
							//fuehrt zu CXF-Fehler! neue Version ohne SOAP-Action funktioniert:
							List<HeaderProperty> respHeaders = androidHttpTransport.call("", envelope, reqHeaders);

	        /* Get the web service response using the getResponse method of the SoapSerializationEnvelope object.
	         * The result has to be cast to SoapPrimitive, the class used to encapsulate primitive types, or to SoapObject.
	         */
			result = envelope.getResponse();

			if (result instanceof SoapFault) {
				throw (SoapFault) result;
			}
		}
		catch (SoapFault e) {
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return (SoapObject) result;
	}
}
