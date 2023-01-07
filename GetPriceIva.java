package Ejercicio2GetPriceIva;

import java.util.Scanner;

public class GetPriceIva {
/***
 * La presente Class nos permitira obtener diferentes tipos de datos y dependiendo de esto,
 * utilizare la sobrecarga del constructor para tratar el tipo de dato e incrementarle el
 * valor del IVA establecido.
 * Para implementarla haremos uso del objeto Scanner el cual nos permite leer la entrada desde
 * la consola.
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
