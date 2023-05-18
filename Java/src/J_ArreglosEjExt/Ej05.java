/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package J_ArreglosEjExt;

import java.util.Random;

public class Ej05 {
    
    public static void main(String[] args) {
        int n = 3; // tamaño de la matriz
        int m = 4;
        int[][] matriz = new int[n][m];
        Random rnd = new Random(); // generador de números aleatorios

        // llenar la matriz con números aleatorios entre 1 y 10
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rnd.nextInt(10) + 1;
            }
        }

        // mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // calcular la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        // mostrar la suma de los elementos
        System.out.println("La suma de los elementos es: " + suma);
    }
}
