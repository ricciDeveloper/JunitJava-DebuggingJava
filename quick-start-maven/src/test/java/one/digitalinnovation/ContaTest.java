package one.digitalinnovation;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest
{
    @Test
    void validaSaldo(){
        Conta conta = new Conta("12345",100);
        Assertions.assertNotNull(conta);

        conta.lancaCredito(50);
        Assertions.assertEquals(150, conta.getSaldo());

        conta.lancaDebito(60);
        Assertions.assertEquals(90, conta.getSaldo());
        Assertions.assertNotEquals(91, conta.getSaldo());

        conta = null;
        Assert.assertNull(conta);

    }
}
