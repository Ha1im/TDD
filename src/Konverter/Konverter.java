package Konverter;

public class Konverter {
	static double result;

	public Konverter(double vrijednost) {

	}

	public static double kilogramUFunte(double vrijednost) {
		return result = vrijednost * 2.0462;
	}

	public static double funteUKilograme(double vrijednost) {
		return result = vrijednost * 0.45392;
	}

	public static double centimetarUInce(double vrijednost) {
		return result = vrijednost * 0.3937;
	}

	public static double inciUCentimetre(double vrijednost) {
		return result = vrijednost * 2.54;
	}

	public static double celzijusiUFarenhajte(double vrijednost) {
		return result = vrijednost * 1.8 + 32;
	}

	public static double farenhajtiUCelzijuse(double vrijednost) {
		return result = (vrijednost - 32) / 1.8;
	}

	public double getKonvertovanaVrijednost() {
		return result;
	}

}
