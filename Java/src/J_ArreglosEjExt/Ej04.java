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
package J_ArreglosEjExt;

import java.util.Scanner;

public class Ej04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[10][4]; // arreglo para almacenar las notas de los 10 alumnos

        // cargar las notas de los alumnos
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        // calcular los promedios de los alumnos
        double[] promedios = new double[10];
        for (int i = 0; i < 10; i++) {
            double promedio = notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5;
            promedios[i] = promedio;
        }

        // contar la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // mostrar los resultados por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
