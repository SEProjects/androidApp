package de.fh_muenster.autovermietung;

public class Bezahlmethode {
	private int bmid;

	private Kunde kunde;
	
	public Bezahlmethode() { }

	public Bezahlmethode(Kunde kunde) {
		this.kunde = kunde;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public int getBmid() {
		return bmid;
	}

	public void setBmid(int bmid) {
		this.bmid = bmid;
	}

	
}
