package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Pagan;

public class Main {
	public static void main(String[] args) {
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setNume("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstance("Ana", 2, 30);
		BrokerTranzactieLazy lazy2 = BrokerTranzactieLazy.getInstance("Bianca", 4, 50);
		
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString());
		
		Pagan pagan1 = Pagan.getInstance("Gabi", 22, 1.87);
		Pagan pagan2 = Pagan.getInstance("Robert", 22, 1.82);
		System.out.println(pagan1.toString());
		System.out.println(pagan2.toString());
	}
}
