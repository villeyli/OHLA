package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import main.*;

public class test {
	@Mock
	IHinnoittelija hinnoittelijaMock;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	@DisplayName("Cheap")
	public void testaaKäsittelijäWithMockitoHinnoittelijaCheap() {
		// Arrange
		float alkuSaldo = 100.0f;
		float listaHinta = 30.0f;
		float alennus = 20.0f;
		float loppuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));
		Asiakas asiakas = new Asiakas(alkuSaldo);
		Tuote tuote = new Tuote("TDD in Action", listaHinta);
		// Record
		when(hinnoittelijaMock.getAlennusProsentti(asiakas, tuote)).thenReturn(alennus);
		// Act
		TilaustenKäsittely käsittelijä = new TilaustenKäsittely();
		käsittelijä.setHinnoittelija(hinnoittelijaMock);
		käsittelijä.käsittele(new Tilaus(asiakas, tuote));
		// Assert
		assertEquals(loppuSaldo, asiakas.getSaldo(), 0.001);
		verify(hinnoittelijaMock, times(2)).getAlennusProsentti(asiakas, tuote);
	}
	
	@Test
	@DisplayName("Expensive")
	public void testaaKäsittelijäWithMockitoHinnoittelijaExpensive() {
		// Arrange
		float alkuSaldo = 100.0f;
		float listaHinta = 100.0f;
		float alennus = 20.0f;
		float loppuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));
		Asiakas asiakas = new Asiakas(alkuSaldo);
		Tuote tuote = new Tuote("TDD in Action", listaHinta);
		// Record
		when(hinnoittelijaMock.getAlennusProsentti(asiakas, tuote)).thenReturn(alennus);
		// Act
		TilaustenKäsittely käsittelijä = new TilaustenKäsittely();
		käsittelijä.setHinnoittelija(hinnoittelijaMock);
		käsittelijä.käsittele(new Tilaus(asiakas, tuote));
		// Assert
		assertEquals(loppuSaldo, asiakas.getSaldo(), 0.001);
		verify(hinnoittelijaMock, times(2)).getAlennusProsentti(asiakas, tuote);
		verify(hinnoittelijaMock).setAlennusProsentti(asiakas, alennus+5);
	}
}
