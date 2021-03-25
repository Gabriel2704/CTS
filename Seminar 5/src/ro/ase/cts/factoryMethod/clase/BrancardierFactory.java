package ro.ase.cts.factoryMethod.clase;

public class BrancardierFactory implements FactoryPersonal{
	public PersonalSpital getPersonal(String nume) {
		return new Brancardier(nume);
	}
}
