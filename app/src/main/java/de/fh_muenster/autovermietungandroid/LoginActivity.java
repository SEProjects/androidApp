package de.fh_muenster.autovermietungandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import de.fh_muenster.R;
import de.fh_muenster.autovermietung.Kunde;
import de.fh_muenster.autovermietung.exceptions.InvalidLoginException;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

	}

	public void goToLogIn(View view) {

		EditText email = (EditText) findViewById(R.id.emailAdresse);
		EditText password = (EditText) findViewById(R.id.password);

		if(email.getText().toString().equals("") && password.getText().toString().equals("")) {
			//Toast anzeigen
			CharSequence text = "Fehlende Logindaten bitte in den Einstellungen eintragen!";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(email.getContext(), text, duration);
			toast.show();
		}
		else {
			LoginTask loginTask = new LoginTask(email.getContext());
			//Proxy asynchron aufrufen
			loginTask.execute(email.getText().toString(), password.getText().toString());

		}
	}
/*
	public void startHomescreen() {
		//Nächste Activity anzeigen
		Intent i = new Intent(this, Homescreen.class);
		startActivity(i);
	}
*/

	private class LoginTask extends AsyncTask<String, Integer, Kunde> {
		//Dem Konstruktor der Klasse wird der aktuelle Kontext der Activity übergeben
		//damit auf die UI-Elemente zugegriffen werden kann und Intents gestartet werden können, usw.
		public LoginTask(Context email) {this.email = email;}

		private Context email;
		@Override
		protected Kunde doInBackground(String... params) {
			MainApplication serviceBean = (MainApplication) getApplication();
			try {
				Kunde myKunde = serviceBean.getAutovermietungOnlineService().login(params[0], params[1]);
				return myKunde;
			} catch (InvalidLoginException e) {
				e.printStackTrace();
			}
			return null;
		}

		protected void onProgessUpdate(Integer... values) {
			//wird in diesem Beispiel nicht verwendet
		}

		protected void onPostExecute(Kunde result) {
			if(result != null) {
				//erfolgreich eingeloggt
				MainApplication myApp = (MainApplication) getApplication();
				myApp.setUser(result);
				//Toast anzeigen
				CharSequence text = "Login erfolgreich! Angemeldeter Benutzername: " + result.getEmail();
				int duration = Toast.LENGTH_SHORT;
				Toast toast = Toast.makeText(email, text, duration);
				toast.show();
				//Nächste Activity anzeigen
				Intent i = new Intent(email, Homescreen.class);
				startActivity(i);
			}
			else {
				//Toast anzeigen
				CharSequence text = "Login fehlgeschlagen!";
				int duration = Toast.LENGTH_SHORT;
				Toast toast = Toast.makeText(email, text, duration);
				toast.show();
				EditText email = (EditText) findViewById(R.id.emailAdresse);
				EditText password = (EditText) findViewById(R.id.password);
				email.setText("");
				password.setText("");
			}
		}
	}

}
