/*
Secci�n 2: Variables
Lecci�n 20: Sistemas num�ricos y entradas de datos desde el terminal
*/

package Seccion_2_Variables;

import java.util.Scanner;

public class SistemasNumericosTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un n�mero entero:");
        int numeroDecimal = 0;

        // Try es el bloque de excepci�n (donde captura el error) y catch lo que se ejecuta si encuentra un error
        try{
            numeroDecimal = scanner.nextInt();  // Permite ingresar un dato de tipo int desde la terminal
        } catch (Exception e){
            System.out.println("Error, debe ingresar un n�mero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "N�mero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "N�mero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "N�mero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
