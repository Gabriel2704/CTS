package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa=new Masa(3);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		//masa.setStareMasa(new Libera());
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
		
	}

}
