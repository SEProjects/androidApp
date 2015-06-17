package de.fh_muenster.autovermietung;


public class Kreditkarte extends Bezahlmethode {
	private String kartentyp;

	private int kknummer;

	private int ablaufdatum;

	private int kpn;
	public Kreditkarte() {	}
	
	public Kreditkarte(String kartentyp, int kKnummer, int ablaufdatum, int kPN,Kunde kunde) {
		super(kunde);
		this.kartentyp = kartentyp;
		kknummer = kKnummer;
		this.ablaufdatum = ablaufdatum;
		kpn = kPN;
	}

	public String getKartentyp() {
		return kartentyp;
	}

	public void setKartentyp(String kartentyp) {
		this.kartentyp = kartentyp;
	}

	public int getKknummer() {
		return kknummer;
	}

	public void setKknummer(int kknummer) {
		this.kknummer = kknummer;
	}

	public int getAblaufdatum() {
		return ablaufdatum;
	}

	public void setAblaufdatum(int ablaufdatum) {
		this.ablaufdatum = ablaufdatum;
	}

	public int getKpn() {
		return kpn;
	}

	public void setKpn(int kpn) {
		this.kpn = kpn;
	}
	

	
}
