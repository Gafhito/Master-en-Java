/*
Sección 2: Variables
Lección 23: Conversiones entre tipos primitivos
 */

package Seccion_2_Variables;

public class ConversionDeTipos3 {
    public static void main(String[] args) {
        int i = 64;

        // Escribiendo el tipo a convertir entre paréntesis,
        // el sistema (obliga) realiza el cast al tipo de dato más pequeño
        short s = (short) i;
        System.out.println("s = " + s);

        // Para tipos de datos más grandes no es necesario el cast, puesto que no hay pérdida de información
        long l = i;
        System.out.println("l = " + l);

        char c = (char) i;
        System.out.println("c = " + c);

        float f = (float) i;
        System.out.println("f = " + f);
    }
}
