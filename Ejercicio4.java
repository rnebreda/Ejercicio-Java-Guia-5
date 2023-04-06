/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).

 */
package ejerciciosguia5;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
        // TODO code application logic here
        String aux;
        int [] [] matriz = new int [4] [4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [i] [j] = (int) (Math.random() * 10);
            }
            System.out.println("");
        }
        for (int [] fila : matriz){
            aux = "";
            for (int elemento: fila) {
            aux+= " " + elemento;
            
            }
            System.out.println(aux);
            
        }
        System.out.println("");
         
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
               //matriz [j] [i] = (int) (Math.random() * 10);
                System.out.print(" " + matriz [i] [j]);
            }
            System.out.println("");
        }
    }
    
}