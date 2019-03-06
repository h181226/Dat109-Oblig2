package no.hvl.dat109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Terningspill {
	//Objektvariabler
	private Kopp k;
	private ArrayList<Spiller> spillere;
	
	//Konstruktø
	/**
	 * Standard konstruktør som lager et spill med 2 terninger i koppen
	 */
	public Terningspill() {
		this(2);
	}
	
	/**
	 * Konsturktør som gir mulighet til å spille med flere terninger
	 * @param antallTerninger som koppen skal inneholde
	 */
	public Terningspill(int antallTerninger) {
		k = new Kopp(antallTerninger);
		spillere = new ArrayList<>();
	}
	
	/**
	 * Oppretter spillet og legger til antall spillere som brukeren skiver inn
	 */
	public void lagSpill() {
		Integer antallSpillere = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Skriv antall spillere: ");
		
		try {
			antallSpillere = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < antallSpillere; i++) {
				leggTilSpiller(br);
			}
			
			br.close();
		} catch (IOException e) {
			System.out.println("Feil i leggTilSpiller ");
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Triller terningene for alle spillerne og finner deretter vinneren
	 * @return vinneren av spillet
	 */
	public Spiller Spill() {
		Iterator<Spiller> it = spillere.iterator();
		Spiller vinner = it.next();
		Spiller current = null;
		
		for(Spiller s : spillere) {
			s.spill(k);
		}
		
		while(it.hasNext()) {
			current = it.next();
			if(vinner.getSum() < current.getSum()) {
				vinner = current;
			}
		}
		
		return vinner;
	}
	
	/**
	 * Spør etter navn på spilleren og legger spilleren til i samlingen spillere
	 */
	private void leggTilSpiller(BufferedReader br) throws IOException{
		System.out.println("Skriv navn på spiller" + (spillere.size() + 1) +": ");
		
		spillere.add(new Spiller(br.readLine()));
	}

}
