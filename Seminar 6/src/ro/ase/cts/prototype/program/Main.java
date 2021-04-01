package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		ContClient cont1 = new ContClient("Marcel", 18, 1);
		ContClient cont2 = (ContClient) cont1.copiaza();

		Bilet bilet1 = new Bilet(1, "Steaua", "Dinamo", "01.04.2021");
		
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		bilet1.setCodBilet(2);
		
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet1.setCodBilet(3);

		System.out.println(cont1);
		System.out.println(cont2);
		
		System.out.println(bilet1);
		System.out.println(bilet2);
		System.out.println(bilet3);
	}

}
