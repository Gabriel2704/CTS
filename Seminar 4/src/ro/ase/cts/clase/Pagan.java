package ro.ase.cts.clase;

public class Pagan {
	private String nume;
	private int varsta;
	private double inaltime;
	
	private static Pagan pagan = null;
	
	private Pagan(String nume, int varsta, double inaltime) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.inaltime = inaltime;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setInaltime(double inaltime) {
		this.inaltime = inaltime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pagan [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", inaltime=");
		builder.append(inaltime);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized Pagan getInstance(String nume, int varsta, double inaltime) {
		if(pagan == null) {
			pagan = new Pagan(nume, varsta, inaltime);
		}
		return pagan;
	}
}
