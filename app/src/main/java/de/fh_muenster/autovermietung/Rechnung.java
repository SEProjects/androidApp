package de.fh_muenster.autovermietung;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rechnung {
	private int rid;

	private BigDecimal gesamtpreis;

	private Date timestamp;

	private BigDecimal mwst;
	

	private List<Mieten> rechnungspositionen;

	private Kunde kunde;

	public Rechnung() {	}

	public Rechnung(BigDecimal gesamtpreis, BigDecimal mwst, Kunde kunde) {
		this.gesamtpreis = gesamtpreis;
		this.mwst = mwst;
		this.kunde = kunde;
		rechnungspositionen = new ArrayList<>();
	
	}
	public void addRechnungsposition(Mieten miet){
		rechnungspositionen.add(miet);
	}

	public BigDecimal getGesamtpreis() {
		return gesamtpreis;
	}


	public void setGesamtpreis(BigDecimal gesamtpreis) {
		this.gesamtpreis = gesamtpreis;
	}


	public BigDecimal getMwst() {
		return mwst;
	}


	public void setMwst(BigDecimal mwst) {
		this.mwst = mwst;
	}


	public List<Mieten> getRechnungspositionen() {
		return rechnungspositionen;
	}


	public void setRechnungspositionen(List<Mieten> rechnungspositionen) {
		this.rechnungspositionen =  rechnungspositionen;
	}


	public Kunde getKunde() {
		return kunde;
	}


	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}


	public int getRid() {
		return rid;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	
	
}
