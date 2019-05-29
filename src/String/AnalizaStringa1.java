package String;

import java.util.Scanner;

public class AnalizaStringa1 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite neki string: ");
		String string = unos.nextLine();

		string = string.replaceAll("\\s", "");

		AnalizaStringa metoda = new AnalizaStringa();
		System.out.print("Duzina stringa: " + metoda.duzinaStringa(string));
		metoda.parniKarakteri(string);
		metoda.neparniKarakteri(string);
		System.out.print("\nBroj UPPERCASE karaktera: " + metoda.brojUpperKaraktera(string));
		System.out.print("\nBroj lowercase karaktera: " + metoda.brojLowerKaraktera(string));
		metoda.ostaliKarakteri(string);

		unos.close();

	}

}