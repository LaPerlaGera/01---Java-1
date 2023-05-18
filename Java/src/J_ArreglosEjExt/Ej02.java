/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package J_ArreglosEjExt;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = sc.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < n; i++) {
            vector1[i] = sc.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < n; i++) {
            vector2[i] = sc.nextInt();
        }

        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }

        sc.close();
    }
}
