package JUnit;

import static org.junit.Assert.*;
import String.AnalizaStringa;

import org.junit.Test;
import org.junit.Before;

public class AnalizaStringaTest {
	AnalizaStringa analiza;

	@Before
	public void setUp() {
		analiza = new AnalizaStringa();
	}

	@Test
	public void duzinaStringaTest() {
		int rezultat = analiza.duzinaStringa("Halim");
		assertEquals(5, rezultat, 0.1);
	}

	@Test
	public void brojUppercaseKarakteraTest() {
		int rezultat = analiza.brojUpperKaraktera("HALIM");
		assertEquals(5, rezultat);
	}

	@Test
	public void brojLowercaseKarakteraTest() {
		int rezultat = analiza.brojLowerKaraktera("halim");
		assertEquals(5, rezultat);
	}
	
	
}