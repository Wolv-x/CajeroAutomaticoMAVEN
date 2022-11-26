package ec.edu.epn;

import java.util.HashMap;

public class Tarjeta {
    HashMap<String, String> tarjetas;
    private final Teclado ingreso;

    public Tarjeta() {
        tarjetas = new HashMap<>();
        ingreso = new Teclado();
        //numeros de cuenta de 6 digitos
        //            clave           contraseña
        tarjetas.put("4271900557374142", "123");
        tarjetas.put("4716050069748111", "672");
        tarjetas.put("4485305457933389", "345");
        tarjetas.put("4278174463982835", "987");
    }

    //Metodo de consulta con la base de datos
    public boolean validarTarjeta(String numeroTarjeta, String clave) {
        if (numeroTarjeta.length() != 16) {
            return false;
        } else {
            if (clave.length() != 3) {
                return false;
            } else {
                if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {
                    if (tarjetas.containsKey(numeroTarjeta)) {//consultar en BD
                        //unica opcion viable para retornar verdadero
                        return tarjetas.get(numeroTarjeta).equals(clave);
                    }
                }
                return false;
            }
        }
    }
    //validar 16 numeros de tarjeta all en la misma seccion-->6to Gabriel
    //*********************************************//
    //validar 3 digitos de la clave all ahi mismo -->7mo Gabriel
    //*********************************************//
    //validar si se ingresa numeros y no texto all ahi mismo -->8vo Nicolas --> /metodo deteccion Dennis
    //*********************************************//

    public void cambiarClave(String numeroTarjeta, String clave){
            System.out.println("Ingrese su nueva clave");
            String claveNueva = ingreso.getEntrada();

            if (claveNueva.length() == 3 && Teclado.isNumeric(claveNueva)) {
                if (!(clave.equals(claveNueva))) {
                    this.tarjetas.replace(numeroTarjeta, clave, claveNueva);
                    System.out.println("Clave cambiada.");
                }else {
                    System.out.println("La clave ingresada es la misma.");
                }
            }else{
                System.out.println("No se ha cambiado la clave");
            }
    }
}
