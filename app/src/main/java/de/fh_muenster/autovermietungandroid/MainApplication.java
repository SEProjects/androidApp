package de.fh_muenster.autovermietungandroid;

import android.app.Application;

import de.fh_muenster.autovermietung.Kunde;
import de.fh_muenster.autovermietung.OnlineService;

/**
 * Created by marian on 17.06.15.
 */
public class MainApplication extends Application {
	private Kunde user;
	private OnlineService autovermietungOnlineService;

	public MainApplication() { this.autovermietungOnlineService = new OnlineServiceImpl(); }

	public Kunde getUser() {
		return this.user;
	}

	public void setUser(Kunde user) {
		this.user = user;
	}

	public OnlineService getAutovermietungOnlineService() {
		return this.autovermietungOnlineService;
	}
}
