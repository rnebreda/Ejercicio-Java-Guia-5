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
public class EjerciciosGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipo = new String[5];
        Scanner nombre = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nombre");
            equipo[i] = nombre.nextLine();
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo[i]);
        }
    }

}
