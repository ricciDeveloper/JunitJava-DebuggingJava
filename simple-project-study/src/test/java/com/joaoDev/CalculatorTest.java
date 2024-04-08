package com.joaoDev;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @Test

    public void verificarSoma(){
        
    Calculator c = new Calculator(5,20);
    int res = c.soma();
    Assertions.assertEquals(25, res);
    }
}
