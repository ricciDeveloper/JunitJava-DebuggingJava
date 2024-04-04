package one.digitalinnovation;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class AfterBeforeTest {
    //testes unitarios com BeforeAll é executado antes de tudo e uma única vez
    @BeforeAll
    static void configuraConexao(){
        ConexaoBancoDeDados.iniciarConexao();
    }
    //testes unitarios com AfterAll é executado depois de tudo e uma única vez
    @AfterAll
    static void finalizarconexao(){
        ConexaoBancoDeDados.finalizarConexao();
    }
    @Test
    void validarRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validaRetorno2(){
        Assertions.assertNull(null);
    }
    //Testes com @BeforeEach é executado uma vez antes de cada teste
    @BeforeEach
    void insereDadosParaTeste() {
        ConexaoBancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }
    //Testes com @BAfterEach é executado uma vez depois de cada teste
    @AfterEach
    void removeDadosDoTeste() {
        ConexaoBancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }
}
