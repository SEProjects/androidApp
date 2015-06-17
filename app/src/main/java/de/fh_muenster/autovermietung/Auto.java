package de.fh_muenster.autovermietung;

import java.util.ArrayList;
import java.util.List;


public class Auto {

	private int aid;

	private String position;

	private String bez;
	
	private Autoart autoart;

	private List<Mieten> gemietet;

	private List<Schaden> schaden;

	private List<Bewertung> bewertungen;

	private List<Dreck> dreck;
	
	public Auto(){	}
	
	
	public Auto( String position, String bez, Autoart autoart) {
		this.position = position;
		this.bez = bez;
		this.autoart = autoart;
		this.gemietet = new ArrayList<>();
		this.schaden = new ArrayList<>();
		this.bewertungen = new ArrayList<>();
		this.dreck = new ArrayList<>();
	}
	
	public void addMieten(Mieten miet){
		gemietet.add(miet);
	}
	public void addSchaden(Schaden schaden){
		this.schaden.add(schaden);
	}
	public void addBewertung(Bewertung bewertung){
		this.bewertungen.add(bewertung);
	}
	public void addDreck(Dreck dreck){
		this.dreck.add(dreck);
	}

	



	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getBez() {
		return bez;
	}


	public void setBez(String bez) {
		this.bez = bez;
	}


	public Autoart getAutoart() {
		return autoart;
	}


	public void setAutoart(Autoart autoart) {
		this.autoart = autoart;
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


	public int getAid() {
		return aid;
	}


	public void setGemietet(List<Mieten> gemietet) {
		this.gemietet = gemietet;
	}


	public List<Mieten> getGemietet() {
		return gemietet;
	}

	
	
}
