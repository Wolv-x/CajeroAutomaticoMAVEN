package ec.edu.epn;


public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta();
        Cuenta cuenta = new Cuenta();
        Menu menu = new Menu();
        menu.iniciarMenu(cuenta, tarjeta);
    }
}

//bloqueo de cuenta validacion por validacion NOOOOOOO
