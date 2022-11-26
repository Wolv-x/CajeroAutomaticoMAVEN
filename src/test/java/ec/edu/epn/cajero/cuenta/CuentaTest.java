package ec.edu.epn.cajero.cuenta;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CuentaTest {
    Cuenta cuenta = null;
    @Before
    public void setUp() {
        cuenta = new Cuenta();
        System.out.println("Setup");
    }
    @Test
     public void given_aBalance_when_consultarSaldo_then_ok() {
        float expected = 27.2F;
        float actual = cuenta.consultarSaldo("4271900557374142");
        assertEquals(expected, actual,0.0F);
    }

    @Test
    public void given_Number_when_isFloat_then_ERROR() {
        assertFalse(Cuenta.isFloat("a27.2"));
    }

}

