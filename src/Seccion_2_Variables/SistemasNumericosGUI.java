/*
Secci�n 2: Variables
Lecci�n 19: Sistemas num�ricos y entrada de datos desde ventana de di�logo
*/

package Seccion_2_Variables;

import javax.swing.*;

public class SistemasNumericosGUI {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un n�mero entero");
        int numeroDecimal = 0;

        // Try es el bloque de excepci�n (donde captura el error) y catch lo que se ejecuta si encuentra un error
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un n�mero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "N�mero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "N�mero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "N�mero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
