package one.digitalinnovation;

import org.junit.jupiter.api.*;
/*Para ordenarmos os nossos testes unitários, precisamos fazer a chamada na classe de teste do @TestMethodOrder
*   E declarar dentro de () A ordenação.
*   Temos displayname, Random, OrderName, orderNumber,etcc*/
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemDosTestes {

    @DisplayName("Teste que valida usuário")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }
    @DisplayName("D")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
