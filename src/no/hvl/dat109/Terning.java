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
	public Integer trillTerning() {
		Random r = new Random();
		
		verdi = r.nextInt(5) + 1;
		
		return verdi;
	}
}
