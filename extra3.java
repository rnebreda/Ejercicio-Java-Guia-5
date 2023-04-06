/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int dimV;

        System.out.println("Ingrese la cantidad de elementos del vector");
        dimV = num.nextInt();
        int vector[] = new int[dimV];

        rellenaVector(vector);
        muestraVector(vector);
    }

    private static void rellenaVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    private static void muestraVector(int[] vector) {

        System.out.print("Los elementos del vector son: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

}
