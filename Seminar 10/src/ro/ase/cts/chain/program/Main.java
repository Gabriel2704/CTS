package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
		Cont economii = new ContEconomii(100);
		Cont curent = new ContCurent(400);
		Cont credit = new ContCredit(300);
		
		curent.setSuccesor(economii);
		economii.setSuccesor(credit);
		
		curent.plateste(50);
		curent.plateste(340);
		curent.plateste(50);
		curent.plateste(200);
		curent.plateste(150);
	}

}
