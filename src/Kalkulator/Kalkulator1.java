package Kalkulator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int selection = -1;

		Kalkulator kalkulator = new Kalkulator();

		while (selection != 0) {
			try {
				System.out.println(
						"Birajte broj ispred operacije koju zelite: \n\n 1. Sabiranje \n 2. Oduzimanje \n 3. Mnozenje \n 4. Dijeljenje \n 0. Izlaz ");

				selection = input.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Unesite cijeli broj!");
				input.nextLine();
			}

			if (selection == 1) {
				System.out.println("Unesite prvi broj: ");
				number1 = input.nextInt();
				System.out.println("Unesite drugi broj: ");
				number2 = input.nextInt();
				int result = kalkulator.sabiranje(number1, number2);
				System.out.println(number1 + " + " + number2 + " = " + result);
			} else if (selection == 2) {
				System.out.println("Unesite prvi broj: ");
				number1 = input.nextInt();
				System.out.println("Unesite drugi broj: ");
				number2 = input.nextInt();
				int result = kalkulator.oduzimanje(number1, number2);
				System.out.println(number1 + " - " + number2 + " = " + result);
			} else if (selection == 3) {
				System.out.println("Unesite prvi broj: ");
				number1 = input.nextInt();
				System.out.println("Unesite drugi broj:");
				number2 = input.nextInt();
				int result = kalkulator.mnozenje(number1, number2);
				System.out.println(number1 + " * " + number2 + " = " + result);
			} else if (selection == 4) {
				System.out.println("Unesite prvi broj: ");
				number1 = input.nextInt();
				System.out.println("Unesite drugi broj: ");
				number2 = input.nextInt();
				int result = kalkulator.dijeljenje(number1, number2);
				System.out.println(number1 + " / " + number2 + " = " + result);
			} else if (selection == 0) {
				break;
			}
		}
		input.close();

	}

}