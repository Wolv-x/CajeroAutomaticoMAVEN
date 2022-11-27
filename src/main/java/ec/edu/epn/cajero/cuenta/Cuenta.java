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
        String retorno;

        String dinero = ingreso.getEntrada();
        if(isFloat(dinero)){
            float saldoResultante = consultarSaldo(numeroTarjeta) - Float.parseFloat(dinero);
            if (saldoResultante<0){
                retorno = "Saldo insuficiente para realizar la transaccion.";
                return retorno;
            }else{
                cuenta.replace(numeroTarjeta, saldoResultante);
                retorno = "Se ha retirado: " + dinero + "$.";
                retorno += "\nSaldo restante: " + saldoResultante;
                return retorno;
            }
        }
        return "Ha surgido un Error inesperado.";
    }

    public static boolean isFloat(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("INGRESE SOLO NÚMEROS, CERRANDO EL PROGRAMA.....");
            System.exit(0);
            return false;
        }
    }

}
