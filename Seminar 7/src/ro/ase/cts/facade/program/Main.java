package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana1 = new Persoana("1923527824222", "Gabi");
		Persoana persoana2 = new Persoana("1923527824232", "Gabriel");
		
		if (Facade.esteEligibil(persoana1)) {
			System.out.println("Oferim credit");
		} else {
			System.out.println("Nu oferim credit");
		}
		
		if (Facade.esteEligibil(persoana2)) {
			System.out.println("Oferim credit");
		} else {
			System.out.println("Nu oferim credit");
		}
	}

}
