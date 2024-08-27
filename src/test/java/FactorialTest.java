import org.example.Lesson_14.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    public void testFactorial_1() {
        Factorial factorial = new Factorial();
        int result = factorial.getFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorial_2() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-5);
        });
    }
}