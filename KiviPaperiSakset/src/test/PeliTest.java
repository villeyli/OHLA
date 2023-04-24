package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import kivipaperisakset.Peli;
import kivipaperisakset.Pelaaja;

/**
 * Pelin testiluokka, testataan pelin kulku ja random luvun luonti
 * @author ville
 *
 */
public class PeliTest {

	Peli peli = new Peli();
	
	// testaa random luku arpakoneen
	@Test
	public void randomvalueTest() {
		int alin = 0;
		int ylin = 2;
		assertTrue("Epäonnistui, sillä random on liian iso", ylin >= peli.randomValue());
		assertTrue("Epäonnistui, sillä random on liian pieni", alin <= peli.randomValue());
	}
	
	// testaa pelin kulkua
	@Test
	public void pelaaTest() {
		Pelaaja p1 = new Pelaaja();
		Pelaaja p2 = new Pelaaja();
		peli.pelaa(p1, p2);
		assertTrue("Peli päättyi, lopputuloksena ei ollu 3 voittoa", 3 == p1.getVoitotYhteensa() || 3 == p2.getVoitotYhteensa());
	}
}
