package ec.edu.epn.cajero.cuenta;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void given_creditCardNumberNotNull_when_validLenghtAndInvalidPassword_then_OK() {
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.validarTarjeta("4485305457933389","345");
        assertNotNull(tarjeta);
    }

}