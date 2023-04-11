/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int filas, columnas;

        System.out.println("Ingrese la cantidad filas 'N' y de columnas 'M' de la matriz");
        filas = num.nextInt();
        columnas = num.nextInt();
        int matriz[][] = new int[filas][columnas];

        rellenaMatriz(matriz, filas, columnas);

        /*
         *Para mostrar puedo usar el bucle for tradicional "muestraMatriz"
         * o el bucle for mejorado "muestraMejorado"
         *Dejar como comentario el que no se utilice (con "//")
         */

        //muestraMatriz(matriz, filas, columnas);
        muestraMejorado(matriz);
    }

    private static void rellenaMatriz(int[][] matriz, int filas, int columnas) {
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma+= matriz [i][j];
            }
        }
        System.out.println("La suma de los elementos es "+suma);
    }

    private static void muestraMatriz(int[][] matriz, int filas, int columnas) {

        System.out.println("Los elementos de la matriz son: ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void muestraMejorado(int[][] matriz) {
        String aux;

        System.out.println("Los elementos de la matriz son: ");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += elemento + " ";
            }
            System.out.println(aux);
        }
        System.out.println("");
    }

}
