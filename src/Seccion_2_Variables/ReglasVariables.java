/*
Sección 2: Variables
Lección 10: Reglas para definir una variable
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

        // Esto es un comentario de una sola línea

        int edadPersona = 5;
        System.out.println("edadPersona = " + edadPersona);

        /*
        Esto es un bloque de
        comentarios
        en más de
        una línea
         */

        int teléfonoñ = 345;  // NO USAR ACENTOS NI LA LETRA Ñ !!!
        System.out.println("teléfonoñ = " + teléfonoñ);
    }
}
