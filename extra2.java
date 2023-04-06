/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).

 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int dimV;
        boolean equivalentes;

        System.out.println("Ingrese la cantidad de elementos de los vectores");
        dimV = num.nextInt();
        int vector1[] = new int[dimV];

        rellenaVector(vector1);
        System.out.println("Vector 1:");
        muestraVector(vector1);
        int vector2[] = new int[dimV];

        /*
         *Para asignar datos aleatorios al vector2 uso "rellenaVector"
         *Para probar si son iguales, al vector2, le asigno el vector 1
         *Dejar como comentario el que no se utilice (con "//")
         */
        rellenaVector(vector2);        
        //vector2=vector1;
        System.out.println("Vector 2: ");
        muestraVector(vector2);

        equivalentes = comparaVectores(vector1, vector2);
        if (equivalentes) {
            System.out.println("Los vectores son equivalentes");
        } else {
            System.out.println("Los vectores no son iguales");
        }

    }

    private static void rellenaVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    private static boolean comparaVectores(int[] vector1, int[] vector2) {
        boolean retorno = true;

        for (int i = 0; i < vector1.length; i++) {
            retorno = vector1[i] == vector2[i];
            if (!retorno) {
                break;
            }
        }
        return retorno;
    }

    private static void muestraVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

}
