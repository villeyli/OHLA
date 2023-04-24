
package kivipaperisakset;

/**
 * Pelin pelaaja luokka, sailoo omat voitot 
 * ja valinnan (kivi, paperi tai sakset)
 * @author Ville
 */
public class Pelaaja {
	
    private int voitotYhteensa;		// Pelaajan voitot

	public Pelaaja() {
		voitotYhteensa = 0;
	}

    /**
     * Pelaaja saa joko kivi, paperi tai sakset
     * @param random - luku, joka maarittaa pelaajan valinnan
     * @return valinta
     */
    public String pelaajanValinta(int random) {
        String valinta = "";
        switch (random) {
            case 0:
                valinta = ("kivi");
                break;
            case 1:
                valinta = ("paperi");
                break;
            case 2:
                valinta = ("sakset");
                break;
        }
        return valinta;
    }
    


    /**
     * kasvataVoitotYhteensa kasvattaa pelaajan
     * voittojen maaraa
     */
    public void kasvataVoitotYhteensa() {
        voitotYhteensa++;
    }

    /**
     * getVoitotYhteensa palauttaa pelaajan voitot
     * @return voitotYhteensa
     */
    public int getVoitotYhteensa() {
        return voitotYhteensa;
    }
}
