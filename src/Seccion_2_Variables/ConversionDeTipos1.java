/*
Secci�n 2: Variables
Lecci�n 21: Conversi�n de cadenas a primitivos
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

        String logicoStr = "TruE";  // Es indistinto si true o false se escriben en may�sculas o min�sculas
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }
}
