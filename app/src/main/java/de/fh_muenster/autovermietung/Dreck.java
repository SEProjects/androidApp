package de.fh_muenster.autovermietung;

import java.util.Date;

public class Dreck {
	private int did;

	private Kunde kunde;

	private Auto auto;

	private Date timestamp;
	public Dreck() {	}
	public Dreck( Kunde kunde, Auto auto) {
		this.kunde = kunde;
		this.auto = auto;
	}
	public Kunde getKunde() {
		return kunde;
	}
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public int getDid() {
		return did;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	
	
	
}
