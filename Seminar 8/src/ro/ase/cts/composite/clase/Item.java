package ro.ase.cts.composite.clase;

public class Item implements ComponentaMeniu {

	String denumire;

	public Item(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		throw new Exception();
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException();
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		throw new IllegalArgumentException();
	}

	@Override
	public void printeaza() {
		System.out.println("Item: " + denumire);
	}

}
