/*
Sección 2: Variables
Lección 18: Sistemas numéricos: decimal, binario, octal y hexadecimal
*/

package Seccion_2_Variables;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        System.out.println("");

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
