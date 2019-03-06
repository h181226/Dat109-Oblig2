package no.hvl.dat109;

public class Spiller {
	//Objektvariabler
	private String navn;
	private Integer sum;
	
	//Konstruktør
	public Spiller() {
		sum = 0;
	}
	
	public Spiller(String navn) {
		this.navn = navn;
		sum = 0;
	}
	
	//Metoder
	/**
	 * Triller terningene i koppen og legger deretter til verdien i sum
	 * @param k Kopp med terninger som brukes i spillet
	 */
	public void spill(Kopp k) {
		k.trill();
		
		sum = k.getSum();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Spiller [navn=" + navn + ", sum=" + sum + "]";
	}
	
	
}
