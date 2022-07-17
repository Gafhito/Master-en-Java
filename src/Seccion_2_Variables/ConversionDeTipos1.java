/*
Sección 2: Variables
Lección 21: Conversión de cadenas a primitivos
 */

package Seccion_2_Variables;

public class ConversionDeTipos1 {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";  // Es indistinto si true o false se escriben en mayúsculas o minúsculas
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }
}
