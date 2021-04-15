package ro.ase.cts.decorator.clase;

public class NotaDePlata implements NotaAbstracta {

	private float suma;

	@Override
	public void printeaza() {
		System.out.println("Suma este " + suma);
	}

	public NotaDePlata(float suma) {
		super();
		this.suma = suma;
	}

}
