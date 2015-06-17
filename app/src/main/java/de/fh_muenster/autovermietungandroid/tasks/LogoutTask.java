package de.fh_muenster.autovermietungandroid.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import de.fh_muenster.autovermietung.exceptions.NoSessionException;
import de.fh_muenster.autovermietungandroid.LoginActivity;
import de.fh_muenster.autovermietungandroid.MainApplication;

/**
 * Created by marian on 17.06.15.
 */
public class LogoutTask extends AsyncTask<Void, Integer, Boolean> {

	private Context context;
	private MainApplication myApp;

	public LogoutTask(Context context, MainApplication myApp) {
		this.context = context;
		this.myApp = myApp;
	}

	@Override
	protected Boolean doInBackground(Void... params){
		try {
			myApp.getAutovermietungOnlineService().logout();
			return true;
		} catch (NoSessionException e) {
			e.printStackTrace();
			return false;
		}
	}

	protected void onPostExecute(Boolean result) {
		if(result) {
			//erfolgreich ausgeloggt
			myApp.setUser(null);

			//Toast anzeigen
			CharSequence text = "Logout erfolgreich!";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(context, text, duration);
			toast.show();

			//Nächste Activity anzeigen
			Intent i = new Intent(context, LoginActivity.class);
			context.startActivity(i);
		}
		else {
			//Toast anzeigen
			CharSequence text = "Logout fehlgeschlagen!";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		}
	}
}
