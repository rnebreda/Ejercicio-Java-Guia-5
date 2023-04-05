/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        int cuenta = 0;
        int posicion = 0;
        Scanner nombre = new Scanner(System.in);
        //vector[i] = (int) (Math.random() * 10 + 1);
        System.out.println("Ingrese el tamaño del vector");
        int limite = nombre.nextInt();
        vector = new int[limite];
        for (int i = 0; i < limite; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingrese un número a buscar (de 1 a 10)");
        int num = nombre.nextInt();
        for (int i = 0; i < limite; i++) {
            if (vector[i] == num) {
                cuenta++;
                if (cuenta == 1) {
                    posicion = i;
                }
            }
        }
        switch (cuenta) {
            case 0:
                System.out.println("El número buscado no está en la lista");
                break;
            case 1:
                System.out.println("El número buscado se encuentra en la posicion " + posicion);
                break;
            default:
                System.out.println("El número buscado está repetido");
                break;
        }
    }

}
