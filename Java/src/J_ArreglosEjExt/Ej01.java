/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package J_ArreglosEjExt;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = input.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}