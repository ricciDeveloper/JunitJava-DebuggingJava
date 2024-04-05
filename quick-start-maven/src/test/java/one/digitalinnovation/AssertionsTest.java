package one.digitalinnovation;

import org.junit.jupiter.api.Test;

/*definir  o import como Static, evita que precise reescrever a classe Assertions */
import java.time.LocalDate;

import  static org.junit.jupiter.api.Assertions.*;
public class AssertionsTest {
    @Test
    void validarValoresOperacao(){
        /*validando soma*/
        int resultado = 10;
        assertEquals(resultado, 5 +5);
    }
    @Test
    void validaArraysIguais(){
        /* Valida se os arrays são iguais, comparando um a um */
        int[] primeiroValor = {10,20,30,40,50};
        int[] segundoValor = {10,20,30,40,50};
        assertArrayEquals(primeiroValor, segundoValor);

        /* Utilizando arrays de diferentes tipos, começando por boolean[] */
        boolean[] flags = {true,false, false};
        assertArrayEquals(new boolean[]{true, false, false}, flags);

        /* Utilizando arrays de diferentes tipos, começando por double[] */
        double[] valores = {5.0,10.5,50D,46d};
        assertArrayEquals(new double[]{5.0,10.5,50D,46d}, valores);
    }
    @Test
    void validarObjetoNuloOuNao(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa ("Victor", LocalDate.now());
        assertNotNull(pessoa);
    }
    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double valor2 = 5.0;

        assertEquals(valor, valor2);
    }
    @Test
    void validarValoresDiferentes(){
        int x = 10;
        int y = 20;

        assertNotEquals(x,y);
    }
    @Test
    void validarCondicaoFalsa(){
        boolean condicao = 5 + 6 == 13;
        assertFalse(condicao);
    }
    @Test
    void validarCondicaoVerdadeira(){
        boolean condicao = 5 + 6 == 11;
        assertTrue(condicao);
    }
}
