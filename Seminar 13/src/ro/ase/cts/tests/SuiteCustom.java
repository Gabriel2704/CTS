package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.GetPromovabilitateCategorie;
import ro.ase.cts.categorii.TesteNormaleCategorie;
import ro.ase.cts.categorii.TesteUrgenteCategorie;
@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaCuPreconditii.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })
//@IncludeCategory(GetPromovabilitateCategorie.class)
@ExcludeCategory({TesteNormaleCategorie.class, TesteUrgenteCategorie.class})
public class SuiteCustom {

}
