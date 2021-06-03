package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategorie;
import ro.ase.cts.categorii.TesteNormaleCategorie;
import ro.ase.cts.categorii.TesteUrgenteCategorie;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {

	@Test
	public void testConstructorCorect() {
		Grupa grupa = new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorSaArunceExceptie() {
		Grupa grupa = new Grupa(988);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorSaArunceExceptie2() {
		Grupa grupa = new Grupa(1200);
	}

	@Test(timeout = 500)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1083);
	}

	@Test
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa = new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}

	@Test
	@Category({GetPromovabilitateCategorie.class,TesteNormaleCategorie.class})
	public void testPromovabilitateCorect() {
		Grupa grupa = new Grupa(1083);

		for (int i = 0; i < 3; i++) {
			Student student = new Student("Robert");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}

		for (int i = 0; i < 7; i++) {
			Student student = new Student("Gabi");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}

		float promovabilitate = 0.7f;

		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test
	@Category({GetPromovabilitateCategorie.class,TesteUrgenteCategorie.class})
	public void testPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1100);

		for (int i = 0; i < 3; i++) {
			Student student = new Student("Robert");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}

		float promovabilitate = 0f;

		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test
	@Category(GetPromovabilitateCategorie.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);

		for (int i = 0; i < 7; i++) {
			Student student = new Student("Gabi");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}

		float promovabilitate = 1f;

		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPromovabilitateEroare() {
		Grupa grupa = new Grupa(1100);
		grupa.getPromovabilitate();
	}
	
	
}
