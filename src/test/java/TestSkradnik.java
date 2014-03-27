import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import by.minsler.Skradnik;

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