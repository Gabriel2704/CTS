package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;

public class Main {

	public static void main(String[] args) {
		Portofel portofel = new Portofel(300);
		Client client = new Client(portofel, "Gabi");
		
		client.platesteNota(200);
		client.setStrategy(new Card());
		client.platesteNota(110);
		client.setStrategy(portofel);
		client.platesteNota(200);

	}

}