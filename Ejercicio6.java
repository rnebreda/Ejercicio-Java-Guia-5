package ejerciciosguia5;

import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean magica;
        int n = 3, m = 3;
        int matriz[][] = new int[n][m];
        /*
         *Para rellenar matriz con datos ingresados por el usuario (como pide el enunciado)
         * utilizar "rellenarusuario"
         *Para rellenar con aleatorios usar "rellenarmatriz".
         *Para rellenar con una matriz mágica (la del ejemplo) usar "rellenarmagica".
         *Dejar como comentario las que no se utilicen (con "//")
         */
        rellenarusuario(matriz, n, m);
        //rellenarmatriz(matriz, n, m);
        //rellenarmagica(matriz, n, m);
        mostrarelementosmatriz(matriz, n, m);
        magica = esmagica(matriz, n, m);
        if (magica) {
            /*
             *Uso "diagonal" para mostrar el resultado de la suma, pero podría usar cualquier función,
             * (diagonal, invertida, sumafila o sumacolumna)
             * ya que si es mágica, toda fila, columna o diagonal suman igual.
             */
            System.out.println("Es màgica!!! La suma de cada fila, columna o diagonal es: " + diagonal(matriz, n, m));
        } else {
            System.out.println("La matriz no es màgica");
        }
    }

    public static void rellenarusuario(int matriz[][], int filas, int columnas) {
        Scanner num = new Scanner(System.in);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                do {
                    System.out.println("Ingrese un número entero entre 1 y 9");
                    matriz[i][j] = num.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
    }

    public static void rellenarmatriz(int matriz[][], int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 8) + 1;
            }
        }
    }

    public static void rellenarmagica(int matriz[][], int filas, int columnas) {
        String aux = "276951438";

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(aux.substring(i * 3 + j, i * 3 + j + 1));
            }
        }
    }

    public static void mostrarelementosmatriz(int matriz[][], int filas, int columnas) {

        System.out.println("Los elementos de la matriz son: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean esmagica(int matriz[][], int filas, int columnas) {
        int i = 1, j = 1, scol, sdiag, sfil, sinv;
        boolean retorno;

        do {
            retorno = sumafila(matriz, i, columnas) == sumafila(matriz, i - 1, columnas);
            i++;
        } while (retorno && i < filas);
        if (retorno) {
            do {
                retorno = sumacolumna(matriz, filas, j) == sumacolumna(matriz, filas, j - 1);
                j++;
            } while (retorno && j < columnas);
        }
        if (retorno) {
            i = 0;
            j = 0;
            sfil = sumafila(matriz, i, columnas);
            scol = sumacolumna(matriz, filas, j);
            sdiag = diagonal(matriz, filas, columnas);
            sinv = invertida(matriz, filas, columnas);
            System.out.println("La suma de las filas es: " + sfil);
            System.out.println("La suma de las columnas es: " + scol);
            System.out.println("La suma de la diagonal es: " + sdiag);
            System.out.println("La suma de la invertida es: " + sinv);
            retorno = (sfil == scol) && (sfil == sdiag) && (sfil == sinv);
        }
        return retorno;
    }

    public static int sumafila(int matriz[][], int i, int columnas) {
        int j, suma = 0;
        for (j = 0; j < columnas; j++) {
            suma += matriz[i][j];
        }
        return suma;
    }

    public static int sumacolumna(int matriz[][], int filas, int j) {
        int i, suma = 0;
        for (i = 0; i < filas; i++) {
            suma += matriz[i][j];
        }
        return suma;
    }

    public static int diagonal(int matriz[][], int filas, int columnas) {
        int i, j, suma = 0;
        for (i = 0; i < filas; i++) {
            j = i;
            suma += matriz[i][j];
        }
        return suma;
    }

    public static int invertida(int matriz[][], int filas, int columnas) {
        int i, j, suma = 0;
        for (i = 0; i < filas; i++) {
            j = columnas - 1 - i;
            suma += matriz[i][j];
        }
        return suma;
    }

}
