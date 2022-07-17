/*
Secci�n 2: Variables
Lecci�n 14: Primitivos num�ricos de punto flotante y sus constantes
*/

package Seccion_2_Variables;

public class PrimitivosFloatConstantes {

    static float varFlotante;
    
    public static void main(String[] args) {
        float realFloat = 0.45f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("El tipo float corresponde a " + Float.BYTES + " bytes");
        System.out.println("El tipo float corresponde a " + Float.SIZE + " bits");
        System.out.println("El valor m�ximo de un float es " + Float.MAX_VALUE);
        System.out.println("El m�nimo valor de un float es " + Float.MIN_VALUE);
        System.out.println("");

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("El tipo double corresponde a " + Double.BYTES + " bytes");
        System.out.println("El tipo double corresponde a " + Double.SIZE + " bits");
        System.out.println("El valor m�ximo de un double es " + Double.MAX_VALUE);
        System.out.println("El m�nimo valor de un double es " + Double.MIN_VALUE);
        System.out.println("");

        /*
        El valor por defecto de las variables enteras es 0 (0.0 en las flotantes),
        pero solo deben declararse fuera del m�todo main para poder inicializarse as�
         */
        System.out.println("varFlotante = " + varFlotante);
    }
}
