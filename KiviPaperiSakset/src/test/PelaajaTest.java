package test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import kivipaperisakset.Pelaaja;


/**
 * Pelaajan testiluokka, testetaan voitot, niiden kasvatus
 * ja pelaajan valinta (kivi, paperi tai sakset).
 * @author ville
 *
 */
public class PelaajaTest {

	Pelaaja p = new Pelaaja(); // Testejä varten luotu pelaaja instanssi
	
	// Testaa voitot
	@Test
	public void getVoitotTest() {
		assertEquals(0, p.getVoitotYhteensa(), "Fail");
	}
	
	// Testaa voittojen kasvatus
	@Test
	public void kasvataVoitotTest() {
		p.kasvataVoitotYhteensa();
	}
	
	// Testaa pelaajan valinta
	@Test
	public void pelaajanValintaTest() {
		assertAll("Varmista pelaajan valinta", 
				() -> assertEquals("kivi", p.pelaajanValinta(0)),
				() -> assertEquals("paperi", p.pelaajanValinta(1)),
				() -> assertEquals("sakset", p.pelaajanValinta(2)));
	}
}
