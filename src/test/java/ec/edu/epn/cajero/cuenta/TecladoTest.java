package ec.edu.epn.cajero.cuenta;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class TecladoTest {

    Teclado teclado = new Teclado();

    @Test
    public void given_numbers_when_isNumeric_then_ok() {

        assertTrue(teclado.isNumeric("5674839076573246"));
    }

    @Test
    public void given_when_then() {
        assertNotNull("El objeto no es nulo", teclado);
    }
}