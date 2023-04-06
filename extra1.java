/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int dimV, suma = 0;
        int[] vector;

        System.out.println("Ingrese la cantidad de elementos ");
        dimV = num.nextInt();
        vector = new int[dimV];

        System.out.println("ingrese los elementos del vector");
        for (int i = 0; i < dimV; i++) {
            vector[i] = num.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

}
