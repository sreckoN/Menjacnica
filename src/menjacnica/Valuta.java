package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String nazivValute;
	private String skracenNaziv;
	private double prodajni;
	private double kupovni;
	private double srednji;
	private GregorianCalendar datum = new GregorianCalendar();
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute == null || nazivValute.isEmpty()) throw new RuntimeException("Morate uneti naziv");
		this.nazivValute = nazivValute;
	}
	public String getSkracenNaziv() {
		return skracenNaziv;
	}
	public void setSkracenNaziv(String skracenNaziv) {
		if(skracenNaziv == null || skracenNaziv.isEmpty()) throw new RuntimeException("Morate uneti skracenicu");
		this.skracenNaziv = skracenNaziv;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(int prodajni) {
		if(prodajni < 0) throw new RuntimeException("Prodajni kurs ne moze biti negativan");
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(int kupovni) {
		if(kupovni < 0) throw new RuntimeException("Kupovni kurs ne moze biti negativan");
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(int srednji) {
		if(srednji < 0) throw new RuntimeException("Srednji kurs ne moze biti negativan");
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum == null) throw new RuntimeException("Morate uneti datum");
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
		Valuta other = (Valuta) obj;
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
