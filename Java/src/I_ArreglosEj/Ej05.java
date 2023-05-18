/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package I_ArreglosEj;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        int filas, columnas;
        System.out.println("Ingrese la cantidad de filas de la matriz");
        filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        columnas = leer.nextInt();
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese los valores la matriz - posición "+i+","+j);
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("");
        System.out.println("MATRIZ INGRESADA");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }
        boolean esAnti = true;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]){
                    esAnti = false;
                }
            }
        }
        if (esAnti == true){
            System.out.println("La matriz ingresada es antisimétrica");
        } else {
            System.out.println("La matriz ingresada no es antisimétrica");
        }
    }
    
}
