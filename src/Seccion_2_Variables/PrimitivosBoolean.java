/*
Sección 2: Variables
Lección 17: Primitivo boolean y lógico binario
*/

package Seccion_2_Variables;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;
        System.out.println("d = " + d);

        float f = 1.2345e2f;
        System.out.println("f = " + f);

        datoLogico = d>f;
        System.out.println("d>f: " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("3-2 = 1: " + esIgual);
    }
}
