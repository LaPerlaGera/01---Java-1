/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package I_ArreglosEj;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() *10);
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingrese un número a buscar en el vector");
        int num = leer.nextInt();
        for (int i = 0; i < 10; i++) {
            if (vector[i] == num){
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("El número no se encuentra en el vector");
        } else {
            System.out.println("El número se encuentra en el vector");
            if (contador > 1){
                System.out.println("El número está repetido");
            } else {
                System.out.println("El número no está repetido");
            }
            System.out.println("El número se encuenta en la posición:");
            for (int i = 0; i < 10; i++) {
                if (vector[i] == num){
                    System.out.println(i);
                }
            }
        }
    }
    
}
