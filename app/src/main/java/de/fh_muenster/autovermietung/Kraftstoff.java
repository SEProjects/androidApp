package de.fh_muenster.autovermietung;

import java.util.ArrayList;
import java.util.List;


public class Kraftstoff {
	private int ksid;

	private String ksbezeichnung;

	private List<Autoart> autoart;
	public Kraftstoff() {	}
	public Kraftstoff(String ksbezeichnung) {
		this.ksbezeichnung = ksbezeichnung;
		this.autoart = new ArrayList<>();
	}
	public void addAutoart(Autoart autoart){
		this.autoart.add(autoart);
	}
	public String getKsbezeichnung() {
		return ksbezeichnung;
	}
	public void setKsbezeichnung(String ksbezeichnung) {
		this.ksbezeichnung = ksbezeichnung;
	}
	public List<Autoart> getAutoart() {
		return autoart;
	}
	public void setAutoart(List<Autoart> autoart) {
		this.autoart = autoart;
	}
	public int getKsid() {
		return ksid;
	}
	
	
}
