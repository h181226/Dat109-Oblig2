package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Iterator;

public class Kopp {
	//Objektvariabler
	private ArrayList<Terning> terningSett;
	
	//Konstruktør
	/**
	 * Standard konstruktø som oppretter to terninger
	 */
	public Kopp() {
		terningSett.add(new Terning());
		terningSett.add(new Terning());
	}
	
	/**
	 * Konstruktør med mulighet til å legge til et antall terninger
	 * @param antall
	 */
	public Kopp(int antall) {
		for (int i = 0; i < antall; i++) {
			terningSett.add(new Terning());
		}
	}
	
	//Metoder
	/**
	 * Triller terningene i terningSett
	 */
	public void trill() {
		for(Terning t : terningSett) {
			t.trillTerning();
		}
	}
	
	/**
	 * Legger sammen verdien av terningene i terningSett
	 * @return samlet verdi av terningene
	 */
	public int getVerdi() {
		int sum = 0;
		
		for(Terning t : terningSett) {
			sum += t.getVerdi();
		}
		
		return sum;
	}

	public ArrayList<Terning> getTerningSett() {
		return terningSett;
	}

	public void setTerningSett(ArrayList<Terning> terningSett) {
		this.terningSett = terningSett;
	}

	@Override
	public String toString() {
		String s = "";
		Iterator<Terning> it = terningSett.iterator();
		int n = 1;
		
		while(it.hasNext()) {
			s += "Terning" + n + ": " + it.next().getVerdi();
			n++;
		}
		
		return s;
	}
}
