package ro.ase.cts.factoryMethod.clase;

public class Medic extends PersonalSpital{
	public Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [nume=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}
}
