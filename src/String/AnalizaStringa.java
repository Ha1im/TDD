package String;

public class AnalizaStringa {
	public int duzinaStringa(String string) {
		int duzina = string.length();
		return duzina;
	}

	public void parniKarakteri(String string) {
		System.out.print("\nKarakteri na parnim pozicijama: ");
		for (int i = 0; i < string.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(string.charAt(i) + " ");
			}
		}
	}

	public void neparniKarakteri(String string) {
		System.out.print("\nKarakteri na neparnim pozicijama: ");
		for (int i = 0; i < string.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(string.charAt(i) + " ");
			}
		}
	}

	public int brojUpperKaraktera(String string) {
		int brojac = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i))) {
				brojac++;
			}
		}
		return brojac;
	}

	public int brojLowerKaraktera(String string) {
		int brojac = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLowerCase(string.charAt(i))) {
				brojac++;
			}
		}
		return brojac;

	}

	public void ostaliKarakteri(String string) {
		System.out.print("\nKarakteri koji nisu slova: ");
		for (int i = 0; i < string.length(); i++) {
			boolean slovo = Character.isLetter(string.charAt(i));
			if (!slovo) {
				System.out.print(string.charAt(i) + " ");
			}
		}
	}

}