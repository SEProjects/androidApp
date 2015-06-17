package de.fh_muenster.autovermietung;

import java.util.ArrayList;
import java.util.List;

public class Marke {
	private int markeid;

	private String markenname;

	private List<Autoart> autoart;
	public Marke() {	}
	public Marke(String markenname) {
		this.markenname = markenname;
		this.autoart = new ArrayList<>();
	}
	public String getMarkenname() {
		return markenname;
	}
	public void setMarkenname(String markenname) {
		this.markenname = markenname;
	}
	public List<Autoart> getAutoart() {
		return autoart;
	}
	public void setAutoart(List<Autoart> autoart) {
		this.autoart = autoart;
	}
	public int getMarkeid() {
		return markeid;
	}
	public void addAutoart(Autoart aa){
		autoart.add(aa);
	}


}
