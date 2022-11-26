package ec.edu.epn.cajero.cuenta;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICuentaTest {

    @Test
    public void give_creditCardNumber_when_exist_ok() {
        ICuenta cuenta = Mockito.mock(ICuenta.class);
        Mockito.when(cuenta.consultarSaldo("4271900557374142")).thenReturn("27.2F");
        assertEquals("27.2F",cuenta.consultarSaldo("4271900557374142"));
    }

}