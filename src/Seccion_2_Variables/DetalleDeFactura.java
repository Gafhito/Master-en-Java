/*
Sección 2: Variables
Tarea 2: Detalle de la factura
 */

package Seccion_2_Variables;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la factura o descripción del producto: ");
        String factura = entrada.nextLine();

        System.out.print("Ingrese el precio del primer producto: ");
        double producto1 = entrada.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double producto2 = entrada.nextDouble();

        double totalNeto = producto1 + producto2;
        double impuesto = totalNeto * 0.19;
        double montoTotal = totalNeto + impuesto;

        System.out.println("");
        String mensaje = "La factura " + factura;
        mensaje += " tiene un total bruto de $" + totalNeto;
        mensaje += ", con un impuesto de $" + impuesto;
        mensaje += " y el monto después del impuesto es de $" + montoTotal;

        System.out.println(mensaje);
    }
}
