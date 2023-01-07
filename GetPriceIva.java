package Ejercicio2GetPriceIva;

import java.util.Scanner;

public class GetPriceIva {
/***
 * La presente Clase nos permitira leer un dato númerico en la entrada de consola mediante
 * el objeto Scanner así como el respectivo valor % Iva con el cual, recalcularemos el valor final
 * incluido el Iva.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        //Hacemos uso del objeto scanner para leer desde la consola:
        System.out.println("Introduce el valor en porcentaje % para el Iva porfavor: ");
        int iva = scanner.nextInt();

        System.out.println("Introduce el $precio porfavor: ");
        int priceInt = scanner.nextInt();

        //Constructor para tipo de dato int
        int getintPriceIvaTotal = suma(iva, priceInt);
        System.out.println("El precio total con Iva incluido es: " + getintPriceIvaTotal);
        }
    public static int suma(int iva, int price){
        int getPriceIva = (price * iva) / 100;
        getPriceIva = price + getPriceIva;
    return getPriceIva;
   }
}
