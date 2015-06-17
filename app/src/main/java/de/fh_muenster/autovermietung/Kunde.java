package de.fh_muenster.autovermietung;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
	private String email;

	private String kvorname;

	private String knachname;
	
	private String kpassword;

	private String fsnummer;

	private String pan;

	private String strasse;

	private boolean saf;
	private boolean admin;

	private List<Mieten> gemietet;
	

	private List<Rechnung> rechnungen;

	private List<Bezahlmethode> bezahlmethoden;

	private List<Schaden> schaden;

	private List<Bewertung> bewertungen;

	private List<Dreck> dreck;

	private FSA fsa;

	private PLZ kplz;
	
	
	public Kunde() {	}

  public Kunde(String email, String kpassword) {
    this.email = email;
    this.kvorname = null;
    this.knachname = null;
    this.kpassword = kpassword;
    this.fsnummer = null;
    this.pan = null;
    this.strasse = null;
    this.gemietet = null;
    this.rechnungen = null;
    this.bezahlmethoden = null;
    this.schaden = null;
    this.bewertungen = null;
    this.dreck = null;
    this.fsa = null;
    this.kplz = null;
  }


	public Kunde(String email, String kvorname, String knachname,
			String kpassword, String fsnummer, String pan, String strasse,
			boolean saf, boolean admin, FSA fsa, PLZ kplz) {
		this.email = email;
		this.kvorname = kvorname;
		this.knachname = knachname;
		this.kpassword = kpassword;
		this.fsnummer = fsnummer;
		this.pan = pan;
		this.strasse = strasse;
		this.saf = saf;
		this.admin = admin;
		this.gemietet = new ArrayList<>();
		this.rechnungen = new ArrayList<>();
		this.bezahlmethoden = new ArrayList<>();
		this.schaden = new ArrayList<>();
		this.bewertungen = new ArrayList<>();
		this.dreck = new ArrayList<>();
		this.fsa = fsa;
		this.kplz = kplz;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getKvorname() {
		return kvorname;
	}


	public void setKvorname(String kvorname) {
		this.kvorname = kvorname;
	}


	public String getKnachname() {
		return knachname;
	}


	public void setKnachname(String knachname) {
		this.knachname = knachname;
	}


	public String getKpassword() {
		return kpassword;
	}


	public void setKpassword(String kpassword) {
		this.kpassword = kpassword;
	}


	public String getFsnummer() {
		return fsnummer;
	}


	public void kunde(String fsnummer) {
		this.fsnummer = fsnummer;
	}


	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	public String getStrasse() {
		return strasse;
	}


	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}


	public boolean isSaf() {
		return saf;
	}


	public void setSaf(boolean saf) {
		this.saf = saf;
	}


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	public List<Mieten> getGemietet() {
		return gemietet;
	}


	public void setGemietet(List<Mieten> gemietet) {
		this.gemietet = gemietet;
	}


	public List<Rechnung> getRechnungen() {
		return rechnungen;
	}


	public void setRechnungen(List<Rechnung> rechnungen) {
		this.rechnungen = rechnungen;
	}


	public List<Bezahlmethode> getBezahlmethoden() {
		return bezahlmethoden;
	}


	public void setBezahlmethoden(List<Bezahlmethode> bezahlmethoden) {
		this.bezahlmethoden = bezahlmethoden;
	}


	public List<Schaden> getSchaden() {
		return schaden;
	}


	public void setSchaden(List<Schaden> schaden) {
		this.schaden = schaden;
	}


	public List<Bewertung> getBewertungen() {
		return bewertungen;
	}


	public void setBewertungen(List<Bewertung> bewertungen) {
		this.bewertungen = bewertungen;
	}


	public List<Dreck> getDreck() {
		return dreck;
	}


	public void setDreck(List<Dreck> dreck) {
		this.dreck = dreck;
	}


	public FSA getFsa() {
		return fsa;
	}


	public void setFsa(FSA fsa) {
		this.fsa = fsa;
	}


	public PLZ getKplz() {
		return kplz;
	}


	public void setKplz(PLZ kplz) {
		this.kplz = kplz;
	}
	public void addmiete(Mieten miet) {
		gemietet.add(miet);
	}
	public void addRechnung(Rechnung rechnung){
		rechnungen.add(rechnung);
	}
	public void addBezahlmethode(Bezahlmethode bzm){
		bezahlmethoden.add(bzm);
			}
	public void addSchaden(Schaden schaden){
		this.schaden.add(schaden);
	}
	public void addBewertung(Bewertung bewertung){
		bewertungen.add(bewertung);
	}
	public void addDreck(Dreck dreck){
		this.dreck.add(dreck);
	}


	@Override
	public String toString() {
		return "Kunde [email=" + email + ", kvorname=" + kvorname
				+ ", knachname=" + knachname + ", kpassword=" + kpassword
				+ ", fsnummer=" + fsnummer + ", pan=" + pan + ", strasse="
				+ strasse + ", saf=" + saf + ", admin=" + admin + ", gemietet="
				+ gemietet + ", rechnungen=" + rechnungen + ", bezahlmethoden="
				+ bezahlmethoden + ", schaden=" + schaden + ", bewertungen="
				+ bewertungen + ", dreck=" + dreck + ", fsa=" + fsa + ", kplz="
				+ kplz + "]";
	}


	public void setFsnummer(String fsnummer) {
		this.fsnummer = fsnummer;
	}
}
