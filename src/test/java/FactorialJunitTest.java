import org.example.Lesson_14_junit_5.FactorialJunit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialJunitTest {
    @Test
    public void testFactorialJunit_1() {
        FactorialJunit factorial = new FactorialJunit();
        int result = factorial.getFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialJunit_2() {
        FactorialJunit factorial = new FactorialJunit();
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-5);
        });
    }
}