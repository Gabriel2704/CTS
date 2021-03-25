package ro.ase.cts.simpleFactory.clase;

public class FactoryPersonal {
	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume) throws Exception {
		switch (tipPersonal) {
		case MEDIC:
			return new Medic(nume);

		case ASISTENT:
			return new Asistent(nume);

		case BRANCARDIER:
			return new Brancardier(nume);
			
		default:
			throw new Exception();
		}
	}
}
