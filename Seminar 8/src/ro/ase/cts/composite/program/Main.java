package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) throws Exception {
		ComponentaMeniu meniu = new Sectiune("Meniu");
		ComponentaMeniu bauturi = new Sectiune("Bauturi");
		ComponentaMeniu desert = new Sectiune("Desert");
		ComponentaMeniu cafea = new Item("Cafea");
		ComponentaMeniu frappe = new Item("Frappe");
		ComponentaMeniu tiramisu = new Item("Tiramisu");
		
		bauturi.adaugaNod(cafea);
		bauturi.adaugaNod(frappe);
		
		desert.adaugaNod(tiramisu);
		
		meniu.adaugaNod(bauturi);
		meniu.printeaza();
		
		System.out.println();
		
		bauturi.stergeNod(frappe);
		
		meniu.adaugaNod(desert);
		meniu.printeaza();
		
	}

}
