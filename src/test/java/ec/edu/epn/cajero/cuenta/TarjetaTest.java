package ec.edu.epn.cajero.cuenta;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TarjetaTest {

    @Test
    public void given_creditCardNumber_when_validLenghtAndValidPassword_then_OK() {
        Tarjeta tarjeta = new Tarjeta();
        assertTrue(tarjeta.validarTarjeta("4271900557374142", "123"));
    }

    @Test
    public void given_creditCardNumber_when_validLenghtAndInvalidPassword_then_OK() {
        Tarjeta tarjeta = new Tarjeta();
        assertFalse(tarjeta.validarTarjeta("4271900557374142", "12333123123"));
    }

}