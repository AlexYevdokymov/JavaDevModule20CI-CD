import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void beforeEach() {
        calc = new Calculator();
    }
    @Test
    public void testSumWorksCorrectWith1() {
        //When
        int actual = calc.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSumWorksCorrectWith3() {
        //When
        int actual = calc.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSumWorksCorrectWith0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
