package ec.edu.epn.cajero.cuenta;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertNotNull;

public class MenuTest {
    Menu menu=null;
    @Before
    public void setUp() {
        menu = new Menu();
        System.out.println("Setup");
    }
    @Test
    public void given_aMenuObject_when_aNotNullObject_then_OK() {
        assertNotNull(menu);
    }

}