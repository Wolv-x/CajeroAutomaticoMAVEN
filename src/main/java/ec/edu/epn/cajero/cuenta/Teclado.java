package ec.edu.epn.cajero.cuenta;

import java.util.Scanner;
public class Teclado {
    Scanner ingreso;
    public Teclado() {
        ingreso = new Scanner(System.in);
    }
    public String getEntrada() {
        return ingreso.next();
    }
    public void cerrarTeclado(){
        ingreso.close();
    }
    public static boolean isNumeric(String cadena) {
        try {
            if(cadena.length()==16){
                Integer.parseInt(cadena.substring(0,8));
                Integer.parseInt(cadena.substring(8,15));
                return true;
            }
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("INGRESE SOLO NÚMEROS, CERRANDO EL PROGRAMA.....");
            System.exit(0);
            return false;
        }
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