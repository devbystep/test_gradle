package by.minsler;

import org.junit.Assert;
import org.junit.Test;

public class TestSkradnik {

	@Test
	public void testPrintUsers(){
		Skradnik.printUsers();
	}

	@Test
	public void testReturnTrue(){
		Assert.assertTrue(Skradnik.returnTrue());
	}
}