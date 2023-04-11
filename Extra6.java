/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().
 */
package ejextras6g5;

import java.util.Scanner;


public class Extra6 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String matriz[][] = new String [20][20];
       
       rellenarPalabras(matriz);
       rellenarNumeros(matriz);
       mostrarMatriz(matriz);
       
    }

    public static void rellenarPalabras(String[][] matriz) {
        System.out.println("Ingrese las palabras entre 3 y 5 caracteres");
        Scanner leer = new Scanner(System.in);
        String palabra;
        int filaAleatoria, inicio;
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]= "*";
            }
        }for (int i = 0; i < 5; i++) {
         
            do {
                  palabra = leer.next();
            }while(palabra.length()<3 || palabra.length()>5);
          
            filaAleatoria = (int)(Math.random()*20);
            inicio = (int)(Math.random()*15);
            for (int j = 0; j < palabra.length(); j++) {
                matriz[filaAleatoria][inicio+j] = palabra.substring(j,j+1);
            }
  
        }
    }

    public static void rellenarNumeros(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j]=="*") {
                    matriz[i][j] = String.valueOf((int)(Math.random()*10));
                }
            }
        }
    }

    public static void mostrarMatriz(String[][] matriz) {
         
           // System.out.println(" ");
            
          for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print( matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
