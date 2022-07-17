/*
Secci�n 2: Variables
Lecci�n 23: Conversiones entre tipos primitivos
 */

package Seccion_2_Variables;

public class ConversionDeTipos3 {
    public static void main(String[] args) {
        int i = 64;

        // Escribiendo el tipo a convertir entre par�ntesis,
        // el sistema (obliga) realiza el cast al tipo de dato m�s peque�o
        short s = (short) i;
        System.out.println("s = " + s);

        // Para tipos de datos m�s grandes no es necesario el cast, puesto que no hay p�rdida de informaci�n
        long l = i;
        System.out.println("l = " + l);

        char c = (char) i;
        System.out.println("c = " + c);

        float f = (float) i;
        System.out.println("f = " + f);
    }
}
