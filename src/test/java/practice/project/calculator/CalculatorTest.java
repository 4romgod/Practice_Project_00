package practice.project.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd_givenInvalidInput_returnsExpectedResult() {
        int result = calculator.add(1, 5);
        assertEquals(6, result);
    }

    @Test
    public void testSubtract_givenInvalidInput_returnsExpectedResult() {
        int result = calculator.subtract(7, 1);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply_givenInvalidInput_returnsExpectedResult() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide_givenInvalidInput_returnsExpectedResult() {
        int result = calculator.divide(12, 2);
        assertEquals(6, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide_givenInvalidInput_throwsArithmeticException() {
        int result = calculator.divide(12, 0);
        assertEquals(6, result);
    }

}