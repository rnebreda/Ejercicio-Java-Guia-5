/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
  Primer trabajo práctico evaluativo 10%
  Segundo trabajo práctico evaluativo 15%
  Primer Integrador 25%
  Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.

 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int dimV = 10;
        double[] notasAlumnos = new double[dimV];

        rellenaVector(notasAlumnos);
        muestraVector(notasAlumnos);
        muestraAprobados(notasAlumnos);

    }

    private static void rellenaVector(double[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = promedio(vector);
        }
    }

    private static void muestraVector(double[] vector) {

        System.out.print("Los promedios de los alumnos son: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");

    }

    private static void muestraAprobados(double[] vector) {
        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 7) {

                aprobados++;
            } else {
                reprobados++;
            }

        }
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos reprobados es: " + reprobados);
    }

    private static double promedio(double[] vector) {
        Scanner num = new Scanner(System.in);
        double sumaNotas = 0, retorno, nota, aux1, aux2;
        double[] ponderado = {0.1, 0.15, 0.25, 0.5};
        String muestra = "", muestraPond = "";
        
        System.out.println("Ingrese las 4 notas del alumno");
        for (int i = 0; i < 4; i++) {
            nota = num.nextDouble();
            sumaNotas += (nota * ponderado[i]);
            aux2 = Math.round(nota * ponderado[i] * 100);
            muestra += (String.valueOf(nota) + " ");
            muestraPond += (String.valueOf(aux2/100) + " ");
        }
        System.out.print("Las notas ingresadas son: ");
        System.out.println(muestra);
        System.out.print("Las notas ponderadas son: ");
        System.out.println(muestraPond);
        
        aux1 = Math.round(sumaNotas * 100);
        retorno = aux1 / 100;
        System.out.println("Promedio = " + retorno);

        return retorno;
    }

}
