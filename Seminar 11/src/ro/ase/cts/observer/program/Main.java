package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager = new ManagerSala("Sala 3");
		
		Observer client1 = new Client("Gabi");
		Observer client2 = new Client("Victor");
		Observer client3 = new Client("Roberta");
		
		manager.adaugareAbonat(client1);
		manager.adaugareAbonat(client2);
		manager.adaugareAbonat(client3);
		
		manager.trimiteAnuntImportant("fotbal");
		manager.trimiteAnuntImportant("volei");
		manager.stergereAbonat(client3);
		manager.trimiteAnuntImportant("handbal");
	}

}
