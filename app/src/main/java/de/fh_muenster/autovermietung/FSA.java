package de.fh_muenster.autovermietung;

import java.util.ArrayList;
import java.util.List;

public class FSA {
	private int fsa;

	private String fsaname;

	private List<Kunde> kunden;
	public FSA() {	}

	public FSA(String fSAName) {
		fsaname = fSAName;
		kunden = new ArrayList<>();
	}

	public void addKunde(Kunde kunde){
		kunden.add(kunde);
	}

	public String getFsaname() {
		return fsaname;
	}

	public void setFsaname(String fsaname) {
		this.fsaname = fsaname;
	}

	public List<Kunde> getKunden() {
		return kunden;
	}

	public void setKunden(List<Kunde> kunden) {
		this.kunden = kunden;
	}

	public int getFsa() {
		return fsa;
	}

}
