package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledInNativeImage;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTest {
    /*Aqui trabalhamos com um range da JRE de Java11 até a version 21.
    *   */
    @Test
    @EnabledForJreRange(min= JRE.JAVA_11, max=JRE.JAVA_21)
    void validarAlgo(){
        Assertions.assertEquals(19,10+9);
    }

}
