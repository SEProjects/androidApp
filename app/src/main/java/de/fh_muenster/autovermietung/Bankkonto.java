package de.fh_muenster.autovermietung;


public class Bankkonto extends Bezahlmethode {

	private String iban;

	private String bic;
	
	public Bankkonto() {	}
	public Bankkonto(String iBan, String bIC,Kunde kunde) {
		super(kunde);
		iban = iBan;
		bic = bIC;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	

}
