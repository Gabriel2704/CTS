package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategorie;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mock.StudentFake;

public class TestGrupaWithFake {

	@Test
	@Category(GetPromovabilitateCategorie.class)
	public void testPromovabiliatetRight() {
		Grupa grupa = new Grupa(1083);

		for (int i = 0; i < 8; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}

		for (int i = 0; i < 2; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}

		assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
	}

}
