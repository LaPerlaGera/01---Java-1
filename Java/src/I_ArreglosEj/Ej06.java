/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
3
 */
package I_ArreglosEj;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca el tamaño del cuadrado (un número impar mayor o igual que 3): ");
            n = sc.nextInt();
        } while (n % 2 == 0 || n < 3);

        int[][] cuadrado = new int[n][n];
        System.out.println("Introduzca los números del cuadrado, uno por uno:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = sc.nextInt();
            }
        }

        boolean esMagico = esCuadradoMagico(cuadrado);
        if (esMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    public static boolean esCuadradoMagico(int[][] cuadrado) {
        int n = cuadrado.length;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        // calcular la suma de la primera fila y la primera columna
        for (int i = 0; i < n; i++) {
            sumaFila += cuadrado[0][i];
            sumaColumna += cuadrado[i][0];
        }

        // calcular la suma de las diagonales
        for (int i = 0; i < n; i++) {
            sumaDiagonal1 += cuadrado[i][i];
            sumaDiagonal2 += cuadrado[i][n - i - 1];
        }

        // comprobar que todas las filas, columnas y diagonales suman lo mismo
        if (sumaFila != sumaColumna || sumaFila != sumaDiagonal1 || sumaFila != sumaDiagonal2) {
            return false;
        }

        // comprobar que cada número del cuadrado es distinto y está en el rango [1, n*n]
        boolean[] numeros = new boolean[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = cuadrado[i][j];
                if (num < 1 || num > n * n || numeros[num]) {
                    return false;
                }
                numeros[num] = true;
            }
        }

        return true;
    }

}
