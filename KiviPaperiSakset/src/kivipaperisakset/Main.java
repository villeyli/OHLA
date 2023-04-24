package kivipaperisakset;

/**
 * 
 * @author ville
 *
 */
public class Main {

	public static void main(String args[]) {
		Peli peli = new Peli();
		Pelaaja p1 = new Pelaaja(); // Pelaaja luokan instanssi
		Pelaaja p2 = new Pelaaja(); // Pelaaja luokan toinen instanssi
		peli.pelaa(p1,p2);

		System.out.println("KOLME VOITTOA - PELI PÄÄTTYY"); 	// Loppu tekstit
	}
}
