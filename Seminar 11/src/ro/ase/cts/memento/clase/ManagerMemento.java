package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> mementouri = new ArrayList<>();

	public void adaugaMemento(Memento memento) {
		mementouri.add(memento);
	}

	public Memento getMemento(int pozitie) {
		if (pozitie >= 0 && pozitie < mementouri.size()) {
			return mementouri.get(pozitie);
		}
		throw new IndexOutOfBoundsException("Pozitie invalida");
	}
}
