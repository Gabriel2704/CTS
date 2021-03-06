package ro.ase.cts.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategorie;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupaCuPreconditii {

	private Grupa grupa;

	@Before
	public void setUp() {
		grupa = new Grupa(1083);
		for (int i = 0; i < 35; i++) {
			Student student = new Student("Gabi");
			for (int j = 0; j < 7; j++) {
				student.adaugaNota(9);
			}
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout = 500)
	@Category(GetPromovabilitateCategorie.class)
	public void testPromovabilitatePerformanta() {
		grupa.getPromovabilitate();
	}
}
