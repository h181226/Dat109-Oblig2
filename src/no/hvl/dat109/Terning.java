package no.hvl.dat109;

import java.util.Random;

public class Terning {
	//Objektvariabler
	private Integer verdi;
	
	//Konstruktør
	public Terning() {
		verdi = 0;
	}
	
	//Metoder
	/**
	 * Genererer et tilfeldig tall mellom 1 og 6
	 * @return verdien av terningen
	 */
	public void trillTerning() {
		Random r = new Random();
		
		verdi = r.nextInt(6) + 1;
	}

	public Integer getVerdi() {
		return verdi;
	}

	public void setVerdi(Integer verdi) {
		this.verdi = verdi;
	}

	@Override
	public String toString() {
		return "Terning [verdi=" + verdi + "]";
	}
	
	
}
