package ro.ase.cts.state.clase;

public class Rezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof Libera) {
			System.out.println("Masa " + masa.getNr() + " trece in stare rezervata!");
			masa.setStareMasa(this);
		} else {
			System.out.println("Masa " + masa.getNr() + " este deja rezervata!");
		}

	}
}
