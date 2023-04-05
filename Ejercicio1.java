/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cien = new int[100];
        Scanner nombre = new Scanner(System.in);
        //for (int i = 1; i <= 100; i++) {

        //    cien[i - 1] = i;
        //}
        for (int i = 0; i < 100; i++) {
            cien[i] = i + 1;
        }
        System.out.println("");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 0) {
                System.out.print(cien[100 - i] + " ");
            } else {
                System.out.println(cien[100 - i] + " ");
            }
        }
    }

}
