package no.hvl.dat109;

public class Klient {
	public static void main(String[] args) {
		Terningspill spill = new Terningspill();
		
		spill.lagSpill();
		System.out.println(spill.Spill().toString());
	}
}
