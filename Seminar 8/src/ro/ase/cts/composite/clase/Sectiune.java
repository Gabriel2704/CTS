package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu {

	private String nume;
	private List<ComponentaMeniu> lista;

	public Sectiune(String nume) {
		super();
		this.nume = nume;
		this.lista = new ArrayList<ComponentaMeniu>();
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		lista.add(componentaMeniu);
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		lista.remove(componentaMeniu);
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		if (index >= 0 && index < lista.size()) {
			return lista.get(index);
		}

		return null;
	}

	@Override
	public void printeaza() {
		System.out.println("Sectiunea " + nume);

		for (ComponentaMeniu optiune : lista) {
			optiune.printeaza();
		}

	}

}
