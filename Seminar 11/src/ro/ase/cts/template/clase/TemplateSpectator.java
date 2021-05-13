package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {
	public abstract void seAseazaLaCoada();

	public abstract void prezintaBiletul();

	public abstract void controlCorporal();

	public abstract void ocupaLoc();

	public final void intrarePeStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		controlCorporal();
		ocupaLoc();
	}
}
