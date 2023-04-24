package kivipaperisakset;

/**
 * @author Ville
 */
public class Peli {
	
	public Peli() {
		
	}
	
	/**
	 * Pelin kulku, parametreina pelaajat. 
	 * Sisaltaa ison osan pelin tulostuksia,
	 * pelaajien valinnat, voittojen laskua ja
	 * pelin lopetuksen. 
	 * @param p1 - pelaaja yksi
	 * @param p2 - pelaaja kaksi
	 */
	public void pelaa(Pelaaja p1, Pelaaja p2) {
		do {
			int pelatutPelit = 0; // Pelattujen pelien lkm
			int tasapelit = 0; // Tasapelien lkm
			// Pelaajien valinta kivi, sakset tai papaeri
			String p1Valinta;		
			String p2Valinta;
			// Konsolintulostuksia pelinkulun seuraamiseksi
			System.out.println("Erä: " + pelatutPelit + " =====================\n");
			System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");
			p1Valinta = p1.pelaajanValinta(randomValue());
			System.out.println(
					"Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1.getVoitotYhteensa() + " voittoa.");
			p2Valinta = p2.pelaajanValinta(randomValue());
			System.out.println(
					"Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2.getVoitotYhteensa() + " voittoa.");

			// If lause tarkastamaan tulos ja määrittämään voittajalle piste
			if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("paperi"))
					|| (p1Valinta.equals("paperi")) && (p2Valinta.equals("sakset"))
					|| (p1Valinta.equals("sakset")) && (p2Valinta.equals("kivi"))) {
				p2.kasvataVoitotYhteensa();
				System.out.println("Pelaaja 2 voittaa");
			} else if (p1Valinta == p2Valinta) {
				tasapelit++;
				System.out.println("\n\t\t\t Tasapeli \n");
			} else {
				p1.kasvataVoitotYhteensa();
				System.out.println("Pelaaja 1 voittaa");
			}
			pelatutPelit++;
			System.out.println();
		} while ((p1.getVoitotYhteensa() < 3) && (p2.getVoitotYhteensa() < 3));  // Peli päättyy voittojen ylittäessä arvon 2
	}
	
	/**
	 * randomValue arpoo random luvun pelaajan
	 * valintaa varten
	 * @return random
	 */
    public int randomValue() {
    	int random = (int) (Math.random() * 3);
    	return random;
    }
}
