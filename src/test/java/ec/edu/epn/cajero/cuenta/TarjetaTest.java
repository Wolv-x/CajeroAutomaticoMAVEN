package ec.edu.epn.cajero.cuenta;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TarjetaTest {

    @Test
    public void given_creditCardNumber_when_validLenght_then_OK() {
        Tarjeta tarjeta = new Tarjeta();
        assertTrue(tarjeta.validarTarjeta("4271900557374142", "123"));
    }

    @Test
    public void otraPrueba6() {

    }
}