package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void validarPessoa(){
        Pessoa pessoa = new Pessoa("Joao", LocalDate.of(1999, 6, 10));
        Assertions.assertEquals(24, pessoa.getIdade());
    }
    @Test
    void retornarSeForMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Joao", LocalDate.of(1999, 6, 10));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pedro = new Pessoa("pedro", LocalDate.now());
        Assertions.assertFalse(pedro.ehMaiorDeIdade());
    }
}
