package ro.ase.cts.factoryMethod.clase;

public class InfirmierFactory implements FactoryPersonal{
	public PersonalSpital getPersonal(String nume) {
		return new Infirmier(nume);
	}
}
