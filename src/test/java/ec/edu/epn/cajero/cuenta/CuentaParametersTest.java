package ec.edu.epn.cajero.cuenta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CuentaParametersTest {
    private float expected;
    private String numeroTarjeta;
    public CuentaParametersTest(String numeroTarjeta, float expected) {
        this.numeroTarjeta = numeroTarjeta;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{"4271900557374142", 27.2F});
        objects.add(new Object[]{"4716050069748111", 2.2F});
        objects.add(new Object[]{"4485305457933389", 7.2F});
        objects.add(new Object[]{"4278174463982835", 0.2F});
        return objects;
    }
    @Test
    public void given_parameters_when_consultarSaldo_then_ok() {
        Cuenta cuenta = new Cuenta();
        float actual = cuenta.consultarSaldo(numeroTarjeta);
        assertEquals(expected, actual,0.0F);
    }
    @Test
    public void given_parameters_when_retirarSaldo_then_ok() {
        Cuenta cuenta = new Cuenta();
        assertNotNull("",cuenta.retirarDinero("1234567890"));
    }

}