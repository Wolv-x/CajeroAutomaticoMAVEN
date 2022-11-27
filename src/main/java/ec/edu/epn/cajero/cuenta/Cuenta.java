package ec.edu.epn.cajero.cuenta;

import java.util.HashMap;

public class Cuenta {
    HashMap<String, Float> cuenta;
    private final Teclado ingreso;

    public Cuenta() {
        cuenta = new HashMap<>();
        ingreso = new Teclado();
        cuenta.put("4271900557374142", 27.2F);
        cuenta.put("4716050069748111", 2.2F);
        cuenta.put("4485305457933389", 7.2F);
        cuenta.put("4278174463982835", 0.2F);
    }

    //Consulta el saldo
    public float consultarSaldo(String numeroTarjeta) {
        return cuenta.get(numeroTarjeta);
    }

    public String retirarDinero(String numeroTarjeta) {
        System.out.print("Ingrese el monto que desea retirar: ");
        String dinero = ingreso.getEntrada();
        if (Teclado.isFloat(dinero)) {
            float saldoResultante = consultarSaldo(numeroTarjeta) - Float.parseFloat(dinero);
            if (saldoResultante < 0) {
                return "Saldo insuficiente para realizar la transaccion.";
            } else {
                cuenta.replace(numeroTarjeta, saldoResultante);
                return "Se ha retirado: " + dinero + "$.\nSaldo restante: " + saldoResultante;
            }
        }
        return "Ha surgido un Error inesperado.";
    }

}
