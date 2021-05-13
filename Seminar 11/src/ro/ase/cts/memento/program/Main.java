package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci = new MeciJucat("Steaua", "Rapid", 100, 100, 20, 500);
		
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(meci.creareMemento());
		System.out.println(meci);
		
		meci.setNumeGazda("Dinamo");
		meci.setNumeOaspeti("Craiova");
		meci.setNrSpectatori(50);
		
		manager.adaugaMemento(meci.creareMemento());
		System.out.println(meci);
		
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci);
	}

}
