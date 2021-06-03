package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategorie;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.mock.StudentStub;

public class TestGrupaWithStub {

	@Test
	@Category(GetPromovabilitateCategorie.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1083);
		IStudent student = new StudentStub();

		grupa.adaugaStudent(student);

		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
