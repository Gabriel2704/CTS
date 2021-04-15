package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLMA;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaAbstracta nota1 = new NotaDePlata(100);
		nota1.printeaza();
		
		DecoratorAbstract decorator1 = new DecoratorNotaPasteFericit(nota1);
		decorator1.printeazaFelicitare();
		decorator1.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decorator2 = new DecoratorNotaLMA(nota1);
		decorator2.printeazaFelicitare();
		decorator2.printeaza();
		
		System.out.println();
		
		NotaAbstracta nota2 = new NotaDePlata(200);
		DecoratorAbstract decorator3 = new DecoratorNotaLMA(nota2);
		DecoratorAbstract decorator4 = new DecoratorNotaPasteFericit(decorator3);
		
		decorator4.printeaza();
		decorator4.printeazaFelicitare();
		
	}

}
