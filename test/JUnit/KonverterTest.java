package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Konverter.Konverter;

public class KonverterTest {

	@Test
	public void testKilogramsToPounds() {

		double vrijednost = Konverter.kilogramUFunte(1.0);

		assertEquals(vrijednost, 2, 0.1);
	}

	@Test
	public void testPoundsToKilograms() {

		double vrijednost = Konverter.funteUKilograme(2.2);

		assertEquals(vrijednost, 1, 0.1);
	}

	@Test
	public void testCentimetersToInches() {

		double vrijednost = Konverter.centimetarUInce(1);

		assertEquals(vrijednost, 0.39, 0.1);
	}

	@Test
	public void testInchesToCentimeters() {

		double vrijednost = Konverter.inciUCentimetre(0.39);

		assertEquals(vrijednost, 1, 0.1);
	}

	@Test
	public void testCelsiousToFahrenheit() {

		double vrijednost = Konverter.celzijusiUFarenhajte(1);

		assertEquals(vrijednost, 33.8, 0.1);
	}

	@Test
	public void testFahrenheitToCelsious() {

		double vrijednost = Konverter.farenhajtiUCelzijuse(33.8);

		assertEquals(vrijednost, 1, 0.1);
	}
}