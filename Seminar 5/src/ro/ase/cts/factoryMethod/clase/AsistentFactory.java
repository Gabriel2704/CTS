package ro.ase.cts.factoryMethod.clase;

public class AsistentFactory implements FactoryPersonal{
	public PersonalSpital getPersonal(String nume) {
		return new Asistent(nume);
	}
}
