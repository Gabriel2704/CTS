package ro.ase.cts.adapterClase.program;

import ro.ase.cts.adapterClase.clase.AdapterCreditClase;
import ro.ase.cts.adapterClase.clase.CreditAbstract;

public class Main {

	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		AdapterCreditClase adapter = new AdapterCreditClase(100, "Gabriel");
		afiseazaInfoCredit(adapter);
	}

}
