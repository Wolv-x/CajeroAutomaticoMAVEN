package ec.edu.epn.cajero.cuenta;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ITarjetaTest {

    @Test
    public void give_creditNumberAndPassword_when_exist_ok() {
        ITarjeta tarjeta = Mockito.mock(ITarjeta.class);
        Mockito.when(tarjeta.validarTarjeta("4271900557374142","123")).thenReturn(true);
        assertEquals(true,tarjeta.validarTarjeta("4271900557374142","123"));

    }
}