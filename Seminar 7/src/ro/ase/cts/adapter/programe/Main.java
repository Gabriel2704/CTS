package ro.ase.cts.adapter.programe;

import ro.ase.cts.adapter.clase.AdapterCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		Leasing leasing = new Leasing(100, "Gabi");
		
		AdapterCreditObiecte adapter = new AdapterCreditObiecte(leasing);
		
		afiseazaInfoCredit(adapter, leasing.getSuma());
	}

}
