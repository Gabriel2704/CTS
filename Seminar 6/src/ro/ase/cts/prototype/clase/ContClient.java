package ro.ase.cts.prototype.clase;

public class ContClient implements AbstractPrototype {
	private String nume;
	private int varsta;
	private int codClient;

	private ContClient() {
		super();
	}

	public ContClient(String nume, int varsta, int codClient) {
		// realizam validari ce consuma resurse
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.codClient = codClient;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContClient [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", codClient=");
		builder.append(codClient);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		ContClient cont = new ContClient();
		cont.nume = this.nume;
		cont.varsta = this.varsta;
		cont.codClient = this.codClient;

		return cont;
	}

}
