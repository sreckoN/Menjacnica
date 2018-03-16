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
	@Override
	public String toString() {
		return "Menjacnica [nazivValute=" + nazivValute + ", skracenNaziv=" + skracenNaziv + ", prodajni=" + prodajni
				+ ", kupovni=" + kupovni + ", srednji=" + srednji + ", datum=" + datum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((skracenNaziv == null) ? 0 : skracenNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (skracenNaziv == null) {
			if (other.skracenNaziv != null)
				return false;
		} else if (!skracenNaziv.equals(other.skracenNaziv))
			return false;
		return true;
	}
	
	
}
