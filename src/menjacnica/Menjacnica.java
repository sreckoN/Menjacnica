package menjacnica;

import java.util.GregorianCalendar;

public class Menjacnica {
	
	private String nazivValute;
	private String skracenNaziv;
	private int prodajni;
	private int kupovni;
	private int srednji;
	private GregorianCalendar datum = new GregorianCalendar();
	
	
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkracenNaziv() {
		return skracenNaziv;
	}
	public void setSkracenNaziv(String skracenNaziv) {
		this.skracenNaziv = skracenNaziv;
	}
	public int getProdajni() {
		return prodajni;
	}
	public void setProdajni(int prodajni) {
		this.prodajni = prodajni;
	}
	public int getKupovni() {
		return kupovni;
	}
	public void setKupovni(int kupovni) {
		this.kupovni = kupovni;
	}
	public int getSrednji() {
		return srednji;
	}
	public void setSrednji(int srednji) {
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
}
