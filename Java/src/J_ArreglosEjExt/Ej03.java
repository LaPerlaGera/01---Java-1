/*
 Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package J_ArreglosEjExt;

import java.util.Random;

public class Ej03 {

    public static void main(String[] args) {
         int[] arr = new int[10];
        fillArrayWithRandomNumbers(arr);
        printArray(arr);
    }
    
    public static void fillArrayWithRandomNumbers(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
