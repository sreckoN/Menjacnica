package menjacnicaInterfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void unesiKursValuteZaDatum(String naziv,String skracenNaziv, int kupovni, int prodajni, int srednji, GregorianCalendar datum);
	public void brisanjeKursaValuteZaDatum(String skracenNaziv, GregorianCalendar datum);
	public double vratiKursValutePoDatumu(String skracenNaziv, GregorianCalendar datum);
}
