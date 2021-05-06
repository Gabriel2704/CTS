package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof Ocupata) {
			System.out.println("Masa" + masa.getNr() + " e ocupata!");
		} else {
			masa.setStareMasa(this);
			System.out.println("Masa " + masa.getNr() + " este acum ocupata!");
		}
	}

}
