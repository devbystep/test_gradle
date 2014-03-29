import by.minsler.Calculator;
import junit.framework.TestCase;
import org.junit.Assert;

public class TestCalculator extends TestCase {

    public static void testSqrt(){
        Assert.assertEquals(7, Calculator.sqrt(49), 0.5 );
    }
}