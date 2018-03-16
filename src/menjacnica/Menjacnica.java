package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void unesiKursValuteZaDatum(String naziv, String skracenNaziv, int kupovni, int prodajni, int srednji,
			GregorianCalendar datum) {
		Valuta v = new Valuta();
		v.setNazivValute(naziv);
		v.setSkracenNaziv(skracenNaziv);
		v.setDatum(datum);
		v.setProdajni(prodajni);
		v.setKupovni(kupovni);
		v.setSrednji(srednji);
		if(valute.contains(v)) return;
		valute.add(v);
	}

	@Override
	public void brisanjeKursaValuteZaDatum(String skracenNaziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getSkracenNaziv().equals(skracenNaziv) && valute.get(i).getDatum().equals(datum))
				valute.remove(valute.get(i));
		}
	}

	@Override
	public double vratiKursValutePoDatumu(String skracenNaziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getSkracenNaziv().equals(skracenNaziv) && valute.get(i).getDatum().equals(datum))
				return valute.get(i).getSrednji();
		}
		return 0;
	}

}
