/*
Sección 2: Variables
Lección 22: Conversiones de tipos primitivos a cadenas
 */

package Seccion_2_Variables;

public class ConversionDeTipos2 {
    public static void main(String[] args) {
        int numeroInt = 100;
        String numeroStr = Integer.toString(numeroInt);
        System.out.println("numeroString = " + numeroStr);

        // .valueOf() es otra forma de convertir valores a Strings con sobrecarga de métodos
        numeroStr = String.valueOf(numeroInt + 10);  // En este caso al entero se le suma 10
        System.out.println("numeroStr = " + numeroStr);

        double realDouble = 1.23456e2;
        String realStr = Double.toString(realDouble);
        System.out.println("realStr = " + realStr);

        realStr = String.valueOf(1.23456e2f);  // En este caso se le pasa como parámetro un float
        System.out.println("realStr = " + realStr);
    }
}
