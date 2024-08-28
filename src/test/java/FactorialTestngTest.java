import org.example.Lesson_14_testng.FactorialTestng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTestngTest {
    @Test
    public void testFactorialTestng_1() {
        FactorialTestng factorial = new FactorialTestng();
        int result = factorial.getFactorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialTestng_2() {
        FactorialTestng factorial = new FactorialTestng();
        factorial.getFactorial(-5);
    }
}