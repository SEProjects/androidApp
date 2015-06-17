package de.fh_muenster.autovermietung;

import java.util.Date;

public class Bewertung {

	private int bid;

	private Kunde kunde;

	private Auto auto;
	private int note;

	private Date timestamp;
	
	public Bewertung() {	}
	public Bewertung(Kunde kunde, Auto auto, int note) {
		this.kunde = kunde;
		this.auto = auto;
		this.note = note;
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
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public int getBid() {
		return bid;
	}
	
}
