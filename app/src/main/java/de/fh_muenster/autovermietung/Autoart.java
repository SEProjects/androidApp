package de.fh_muenster.autovermietung;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Autoart {
	private int aaid;

	private String beschreibung;
	private int ps;
	private int sitzanzahl;
	private int kofferraumvolumen;
	private String bildlink;
	private double kraftstoffverbrauch;

	private BigDecimal pjk;

	private List<Auto> autos;

	private Kraftstoff ks;

	private Marke marke;
	
	public Autoart() {	}

	public Autoart(String beschreibung, int ps, int sitzanzahl,
			int kofferraumvolumen, String bildlink, double kraftstoffverbrauch,
			BigDecimal pjk,  Kraftstoff ks, Marke marke) {
		this.beschreibung = beschreibung;
		this.ps = ps;
		this.sitzanzahl = sitzanzahl;
		this.kofferraumvolumen = kofferraumvolumen;
		this.bildlink = bildlink;
		this.kraftstoffverbrauch = kraftstoffverbrauch;
		this.pjk = pjk;
		this.autos = new ArrayList<>();
		this.ks = ks;
		this.marke = marke;
	}
	public void addAuto(Auto auto){
		autos.add(auto);
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getSitzanzahl() {
		return sitzanzahl;
	}

	public void setSitzanzahl(int sitzanzahl) {
		this.sitzanzahl = sitzanzahl;
	}

	public int getKofferraumvolumen() {
		return kofferraumvolumen;
	}

	public void setKofferraumvolumen(int kofferraumvolumen) {
		this.kofferraumvolumen = kofferraumvolumen;
	}

	public String getBildlink() {
		return bildlink;
	}

	public void setBildlink(String bildlink) {
		this.bildlink = bildlink;
	}

	public double getKraftstoffverbrauch() {
		return kraftstoffverbrauch;
	}

	public void setKraftstoffverbrauch(double kraftstoffverbrauch) {
		this.kraftstoffverbrauch = kraftstoffverbrauch;
	}

	public BigDecimal getPjk() {
		return pjk;
	}

	public void setPjk(BigDecimal pjk) {
		this.pjk = pjk;
	}


	public Kraftstoff getKs() {
		return ks;
	}

	public void setKs(Kraftstoff ks) {
		this.ks = ks;
	}

	public Marke getMarke() {
		return marke;
	}

	public void setMarke(Marke marke) {
		this.marke = marke;
	}

	public int getAaid() {
		return aaid;
	}

	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
	
}
