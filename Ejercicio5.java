/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        //System.out.print("Ingrese la dimension de la matriz: ");
        //int n = num.nextInt();
        int n = 3;
        int[][] matriz = new int[n][n];
        System.out.println("ingrese los elementos ");

        // Rellena la matriz con valores ingresados por el usuario
//        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = num.nextInt();
                // matriz[i][j] = (int) (Math.random() * 20)-10;
            }
        }

        System.out.println("matriz original ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("matriz transpuesta ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println("");
        }

        System.out.println("matriz transpuesta negativa");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + (matriz[j][i]) * (-1));
            }
            System.out.println("");
        }

        // Comprueba si la matriz es antisimétrica
        boolean esAntisimetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i != j) {

                    if (matriz[i][j] != -matriz[j][i]) {
                        esAntisimetrica = false;
                        break;
                    }
                } else if (matriz[i][j] != 0) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }

        // Muestra el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }

    }

}
