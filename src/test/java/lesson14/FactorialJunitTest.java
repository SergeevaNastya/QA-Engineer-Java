package lesson14;

import org.example.lesson14junit5.FactorialJunit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialJunitTest {

    private static FactorialJunit factorial;

    @BeforeAll
    public static void testSetUp() {
        factorial = new FactorialJunit();
    }

    @Test
    public void testFactorialJunitOne() {
        int result = factorial.getFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialJunitTwo() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-5);
        });
    }
}