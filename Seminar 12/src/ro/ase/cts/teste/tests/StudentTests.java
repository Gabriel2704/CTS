package ro.ase.cts.teste.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.teste.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);

		assertEquals("Numele nu a fost initializat!", nume, student.getNume());
		assertNotNull("Lista de note nu a fost initializata!", student.getNote());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();

		assertNotNull("Numele nu a fost initializat!", student.getNume());
		assertNotNull("Lista de note nu a fost initializata!", student.getNote());
	}

	@Test
	public void testSetterNume() {
		String nume = "Gigel";
		Student student = new Student();

		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testAdaugareNota() {
		Student student = new Student();
		int nota = 10;

		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 10;

		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}

	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		int note[] = { 10, 5, 1 };

		student.adaugaNota(note[0]);
		student.adaugaNota(note[1]);
		student.adaugaNota(note[2]);
		float medie = (note[0] + note[1] + note[2]) / 3.0f;
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		int nota = 10;

		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();

		student.calculeazaMedie();
	}

	@Test
	public void testAreRestante() {
		Student student = new Student();

		int note[] = { 10, 9, 1 };
		student.adaugaNota(note[0]);
		student.adaugaNota(note[1]);
		student.adaugaNota(note[2]);

		assertTrue(student.areRestante());
	}

	@Test
	public void testNuAreRestante() {
		Student student = new Student();

		int note[] = { 10, 9, 6 };
		student.adaugaNota(note[0]);
		student.adaugaNota(note[1]);
		student.adaugaNota(note[2]);

		assertFalse(student.areRestante());
	}

	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student = new Student();

		int note[] = { 10, 9, 6 };
		student.adaugaNota(note[0]);
		student.adaugaNota(note[1]);
		student.adaugaNota(note[2]);

		try {
			student.getNota(3);
			fail("Metoda nu arunca exceptie!");
		} catch (IndexOutOfBoundsException e) {

		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNotaIncorecta() {
		Student student = new Student();
		int nota=11;
		
		student.adaugaNota(nota);
	}
}
