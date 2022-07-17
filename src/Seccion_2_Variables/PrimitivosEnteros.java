/*
Sección 2: Variables
Lección 12: Primitivos numéricos enteros
*/

package Seccion_2_Variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El tipo byte corresponde a " + Byte.BYTES + " bytes");
        System.out.println("El tipo byte corresponde a " + Byte.SIZE + " bits");
        System.out.println("El valor máximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de un byte es: " + Byte.MIN_VALUE);
        System.out.println("");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El tipo short corresponde a " + Short.BYTES + " bytes");
        System.out.println("El tipo short corresponde a " + Short.SIZE + " bits");
        System.out.println("El valor máximo de un short es: " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de un short es: " + Short.MIN_VALUE);
        System.out.println("");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El tipo int corresponde a " + Integer.BYTES + " bytes");
        System.out.println("El tipo int corresponde a " + Integer.SIZE + " bits");
        System.out.println("El valor máximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int es: " + Integer.MIN_VALUE);
        System.out.println("");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El tipo long corresponde a " + Long.BYTES + " bytes");
        System.out.println("El tipo long corresponde a " + Long.SIZE + " bits");
        System.out.println("El valor máximo de un long es: " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de un long es: " + Long.MIN_VALUE);
        System.out.println("");

        /*
        En este caso el tipo de dato es float al utilizar el literal 'f'
        pero por defecto las variables de tipo var son Integer
         */
        var numeroVar = 9223372036854775808f;
        System.out.println("numeroVar = " + numeroVar);
    }
}
