import org.example.Lesson_14_testng.FactorialTestng;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FactorialTestngTest {

    private static FactorialTestng factorial;

    @BeforeClass
    public void testSetUp() {
        factorial = new FactorialTestng();
    }

    @Test
    public void testFactorialTestngOne() {
        int result = factorial.getFactorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialTestngTwo() {
        factorial.getFactorial(-5);
    }
}