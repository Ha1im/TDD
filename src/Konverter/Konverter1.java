package Konverter;

import java.util.Scanner;

public class Konverter1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Birajte broj ispred operacije koju zelite: \n\n 1. kg u funte \n 2. funte u kg \n 3. cm u inche \n 4. inchi u cm \n 5. celzijus u farenhajte \n 6. farenhajti u celzijuse ");

		int operacija = input.nextInt();

		while (operacija != 1 && operacija != 2 && operacija != 3 && operacija != 4 && operacija != 5
				&& operacija != 6) {
			System.out.println("Unos operacije nije ispravan. Unesite ponovo!");
			operacija = input.nextInt();
		}

		double vrijednost = 0;

		switch (operacija) {

		case 1:
			System.out.println("Unesite vrijednost u kg: ");
			vrijednost = unosICheck();
			break;
		case 2:
			System.out.println("Unesite vrijednost u funtama: ");
			vrijednost = unosICheck();
			break;
		case 3:
			System.out.println("Unesite vrijednost u centimetrima: ");
			vrijednost = unosICheck();
			break;
		case 4:
			System.out.println("Unesite vrijednost u incima: ");
			vrijednost = unosICheck();
			break;
		case 5:
			System.out.println("Unesite vrijednost u celzijusima: ");
			vrijednost = input.nextDouble();
			break;
		case 6:
			System.out.println("Unesite vrijednost u farenhajtima: ");
			vrijednost = input.nextDouble();
			break;

		}

		Konverter konv = new Konverter(vrijednost);

		switch (operacija) {

		case 1:
			Konverter.kilogramUFunte(vrijednost);
			break;
		case 2:
			Konverter.funteUKilograme(vrijednost);
			break;
		case 3:
			Konverter.centimetarUInce(vrijednost);
			break;
		case 4:
			Konverter.inciUCentimetre(vrijednost);
			break;
		case 5:
			Konverter.celzijusiUFarenhajte(vrijednost);
			break;
		case 6:
			Konverter.farenhajtiUCelzijuse(vrijednost);
			break;

		}

		System.out.println("Vrijednost pretvaranja: " + konv.getKonvertovanaVrijednost());

	}

	public static double unosICheck() {

		double unos = input.nextDouble();

		while (unos < 0) {
			System.out.println("Unos nije ispravan. Unesite ponovo!");
			unos = input.nextDouble();
		}
		return unos;

	}

}