import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //write tests for Calculator.java class method sumPositiveIntegers
    @Test
    public void calculatorTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sumPositiveIntegers(1,2));
    }

    //write tests for calculator class method resetCalculator
    @Test
    public void resetCalculatorTest(){
        Calculator calculator = new Calculator();
        calculator.sumPositiveIntegers(1,2);
        calculator.resetCalculator();
        assertEquals(0, calculator.getCurrentValue());
    }

    //write tests for calculator class method add
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        calculator.add(3);
        assertEquals(3, calculator.getCurrentValue());
    }

    //write tests for calculator class method getCurrentValue
    @Test
    public void getCurrentValueTest(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getCurrentValue());
    }

}
