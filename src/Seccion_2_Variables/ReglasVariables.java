/*
Secci�n 2: Variables
Lecci�n 10: Reglas para definir una variable
*/

package Seccion_2_Variables;

public class ReglasVariables {
    public static void main(String[] args) {
        int numero = 11;
        String nombre;
        nombre = "Gonzalo";

        if (numero>10){
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);

        // Esto es un comentario de una sola l�nea

        int edadPersona = 5;
        System.out.println("edadPersona = " + edadPersona);

        /*
        Esto es un bloque de
        comentarios
        en m�s de
        una l�nea
         */

        int tel�fono� = 345;  // NO USAR ACENTOS NI LA LETRA � !!!
        System.out.println("tel�fono� = " + tel�fono�);
    }
}
