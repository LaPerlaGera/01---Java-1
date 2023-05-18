/*
 Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package G_SubprogEj;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo");
        int num = leer.nextInt();
        numPrimo(num);
    }
    
    public static void numPrimo(int a){
        int contador = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                contador++;
            }
        }
        if (contador == 2){
            System.out.println("El número ingresado es primo");
        }else {
            System.out.println("El número ingresado no es primo");
        }
    }
}
