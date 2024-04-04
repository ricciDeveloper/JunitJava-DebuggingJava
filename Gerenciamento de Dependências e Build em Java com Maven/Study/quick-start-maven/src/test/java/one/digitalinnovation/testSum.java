package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSum {
    @Test
    public void testeSoma(){
        //instancia do construtor da classe Sum
        Sum soma = new Sum(10,20);

        //chamada do método para soma
        int resultado = soma.somaNumeros();
        //método assertEquals para comparar o resultado
        Assertions.assertEquals(30, resultado);
    }
}
