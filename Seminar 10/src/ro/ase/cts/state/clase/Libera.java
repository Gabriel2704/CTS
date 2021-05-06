package ro.ase.cts.state.clase;

public class Libera implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof Ocupata || masa.getStare() instanceof Rezervata) {
			System.out.println("Masa " + masa.getNr() + " poate fi eliberata!");
			masa.setStareMasa(this);
		} else {
			System.out.println("Masa " + masa.getNr() + " este deja libera!");
		}
	}

}
