/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        int aux, cuenta, unaCifra = 0, dosCifras = 0, tresCifras = 0, cuatroCifras = 0, cincoCifras = 0;
        String mostrar = "";
        Scanner nombre = new Scanner(System.in);
        //vector[i] = (int) (Math.random() * 10 + 1);
        System.out.println("Ingrese el tamaño del vector");
        int limite = nombre.nextInt();
        vector = new int[limite];
        // Subprograma que muestre el vector
        for (int i = 0; i < limite; i++) {
            vector[i] = (int) (Math.random() * 100000);
            mostrar+= (vector[i] + " ");
            cuenta=0;
            int aux1=vector[i];
            do {
                aux = aux1 / 10;
                aux1=aux;
                cuenta++;
            } while (aux > 0);
            //Subprograma para imprimir la respuesta
            switch (cuenta) {
                case 1:
                    unaCifra++;
                    break;
                case 2:
                    dosCifras++;
                    break;
                case 3:
                    tresCifras++;
                    break;
                case 4:
                    cuatroCifras++;
                    break;
                case 5:
                    cincoCifras++;
                    break;

            }

        }
        System.out.println(mostrar);
        System.out.println("");
        System.out.println("Hay " + unaCifra + " números de 1 cifra");
        System.out.println("Hay " + dosCifras + " números de 2 cifras");
        System.out.println("Hay " + tresCifras + " números de 3 cifras");
        System.out.println("Hay " + cuatroCifras + " números de 4 cifras");
        System.out.println("Hay " + cincoCifras + " números de 5 cifras");

    }
}
