package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void unesiKursValuteZaDatum(String skracenNaziv, int kupovni, int prodajni, int srednji,
			GregorianCalendar datum) {
		Valuta a = new Valuta();
		a.setSkracenNaziv(skracenNaziv);
		a.setDatum(datum);
		if(valute.contains(a)) return;
		a.setKupovni(kupovni);
		a.setProdajni(prodajni);
		a.setSrednji(srednji);
		valute.add(a);
	}

	@Override
	public void brisanjeKursaValuteZaDatum(String skracenNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public double vratiKursValutePoDatumu(String skracenNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
