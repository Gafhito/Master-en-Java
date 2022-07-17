/*
Sección 2: Variables
Lección 9: Ejemplos de variables
*/

package Seccion_2_Variables;

public class EjemplosVariables {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";
        System.out.println("numero3 = " + numero3);
    }
}
