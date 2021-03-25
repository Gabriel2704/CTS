package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {

		try {
			FactoryPersonal factory = new FactoryPersonal();

			PersonalSpital medic = factory.getPersonal(TipPersonal.MEDIC, "Ana");
			PersonalSpital asistent = factory.getPersonal(TipPersonal.ASISTENT, "Catalin");

			System.out.println(medic.toString());
			System.out.println(asistent.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
