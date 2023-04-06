package ejerciciosguia5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

        //BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        Scanner num = new Scanner(System.in);
        int m;
        boolean magica;
        int matriz[][];
        int n;
        //magica = false;
        do {
            System.out.println("Ingrese la cantidad de filas y columnas (el número debe ser menor o igual a 10)");
            n = num.nextInt();
        } while (n < 2 || n > 10);
        m = n;
        matriz = new int[n][m];
        inicializarmatriz(matriz, n, m);
        //rellenarmatriz(matriz, n, m);
        rellenarmagica(matriz,n,m);
        mostrarelementosmatriz(matriz, n, m);
        magica = esmagica(matriz, n, m);
        if (magica) {
            System.out.println("Es màgica!!! La suma de cada fila, columna o diagonal es: " + diagonal(matriz, n, m));
        } else {
            System.out.println("La matriz no es màgica");
        }
    }

    public static void inicializarmatriz(int matriz[][], int filas, int columnas) {
        int i;
        int j;
        for (i = 0; i <= filas - 1; i++) {
            for (j = 0; j <= columnas - 1; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public static void rellenarmatriz(int matriz[][], int filas, int columnas) {
        int i;
        int j;
        for (i = 0; i <= filas - 1; i++) {
            for (j = 0; j <= columnas - 1; j++) {
                matriz[i][j] = (int) (Math.random() * 8) + 1;
            }
        }
    }

    public static void rellenarmagica(int matriz[][], int filas, int columnas) {
        String aux;
        int i;
        int j;
        aux = "276951438";
        for (i = 0; i <= filas - 1; i++) {
            for (j = 0; j <= columnas - 1; j++) {
                matriz[i][j] = Integer.parseInt(aux.substring(i * 3 + j, i * 3 + j + 1));
            }
        }
    }

    public static void mostrarelementosmatriz(int matriz[][], int filas, int columnas) {
        int i;
        int j;
        System.out.println("Los elementos de la matriz son: ");
        for (i = 0; i <= filas - 1; i++) {
            for (j = 0; j <= columnas - 1; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean esmagica(int matriz[][], int filas, int columnas) {
        int i;
        int j;
        boolean retorno;
        int scol;
        int sdiag;
        int sfil;
        int sinv;
        i = 1;
        j = 1;
        do {
            retorno = sumafila(matriz, i, columnas) == sumafila(matriz, i - 1, columnas);
            i = i + 1;
        } while (retorno && i <= filas - 1);
        if (retorno) {
            do {
                retorno = sumacolumna(matriz, filas, j) == sumacolumna(matriz, filas, j - 1);
                j = j + 1;
            } while (retorno && j <= columnas - 1);
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
            System.out.println("La suma de las invertida es: " + sinv);
            retorno = (sfil == scol) && (sfil == sdiag) && (sfil == sinv);
        }
        return retorno;
    }

    public static int sumafila(int matriz[][], int i, int columnas) {
        int j;
        int suma;
        suma = 0;
        for (j = 0; j <= columnas - 1; j++) {
            suma = suma + matriz[i][j];
        }
        return suma;
    }

    public static int sumacolumna(int matriz[][], int filas, int j) {
        int i;
        int suma;
        suma = 0;
        for (i = 0; i <= filas - 1; i++) {
            suma = suma + matriz[i][j];
        }
        return suma;
    }

    public static int diagonal(int matriz[][], int filas, int columnas) {
        int i;
        int j;
        int suma;
        suma = 0;
        for (i = 0; i <= filas - 1; i++) {
            j = i;
            suma = suma + matriz[i][j];
        }
        return suma;
    }

    public static int invertida(int matriz[][], int filas, int columnas) {
        int i;
        int j;
        int suma;
        suma = 0;
        for (i = 0; i <= filas - 1; i++) {
            j = columnas - 1 - i;
            suma = suma + matriz[i][j];
        }
        return suma;
    }

}
