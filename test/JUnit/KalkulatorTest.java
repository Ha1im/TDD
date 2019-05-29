package JUnit;

import Kalkulator.Kalkulator;

import static org.junit.Assert.*;
import org.junit.Test;

public class KalkulatorTest {

	@Test
	public void additionTest() {
		Kalkulator calculations = new Kalkulator();
		int result = calculations.sabiranje(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void substractionTest() {
		Kalkulator calculations = new Kalkulator();
		int result = calculations.oduzimanje(5, 2);
		assertEquals(3, result);
	}

	@Test
	public void multiplicationTest() {
		Kalkulator calculations = new Kalkulator();
		int result = calculations.mnozenje(2, 3);
		assertEquals(6, result);
	}

	@Test
	public void divisionTest() {
		Kalkulator calculations = new Kalkulator();
		int result = calculations.dijeljenje(6, 3);
		assertEquals(2, result);
	}

}