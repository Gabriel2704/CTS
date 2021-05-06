package ro.ase.cts.state.clase;

public class Masa {
	private int nr;
	private Stare stare;

	public Masa(int nr) {
		super();
		this.nr = nr;
		this.stare = new Libera();
	}

	public int getNr() {
		return nr;
	}

	public Stare getStare() {
		return stare;
	}

	protected void setStareMasa(Stare stare) {
		this.stare = stare;
	}

	public void ocupaMasa() {
		Ocupata masaOcupata = new Ocupata();
		masaOcupata.modificaStare(this);
	}

	public void elibereazaMasa() {
		Libera masaLibera = new Libera();
		masaLibera.modificaStare(this);
	}

	public void rezervaMasa() {
		Rezervata masaRezervata = new Rezervata();
		masaRezervata.modificaStare(this);
	}
}
