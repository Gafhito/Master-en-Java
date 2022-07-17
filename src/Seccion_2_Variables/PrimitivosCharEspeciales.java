/*
Secci�n 2: Variables
Lecci�n 16: Char y caracteres especiales
*/

package Seccion_2_Variables;

public class PrimitivosCharEspeciales {
    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println("caracter = " + caracter);
        System.out.println("El tipo char corresponde a " + Character.BYTES + " bytes");
        System.out.println("El tipo char corresponde a " + Character.SIZE + " bits");
        System.out.println("");

        char espacio = '\u0020';  // Espacio en unicode
        System.out.println("espacio =x" + espacio);

        char retroceso = '\b';
        System.out.println("retroceso = x" + retroceso);

        char tabulador = '\t';
        System.out.println("tabulador =" + tabulador + "x");

        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea + "ac� hace efecto el salto de l�nea");

        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro + "ac� hace efecto el retorno");
    }
}
