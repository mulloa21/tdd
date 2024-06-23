package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void givenTwoIntegersWhenAdditionThenOk(){
        ICalculator iCalculator = Mockito.mock(ICalculator.class);
        Mockito.when(iCalculator.addition(2, 5)).thenReturn(8);
        assertEquals(5, iCalculator.addition(2, 5));
    }
}