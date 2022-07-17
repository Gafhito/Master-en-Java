/*
Sección 2: Variables
Lección 15: Primitivo char o character
*/

package Seccion_2_Variables;

public class PrimitivosChar {
    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println("caracter = " + caracter);
        System.out.println("");

        char unicode = '\u0040';
        System.out.println("unicode = " + unicode);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("unicode = decimal: " + (unicode == decimal));
        System.out.println("decimal = simbolo: " + (decimal == simbolo));
    }
}
