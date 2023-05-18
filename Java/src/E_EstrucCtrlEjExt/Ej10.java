/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = (int) (Math.random()*11);
        int b = (int) (Math.random()*11);
        int c = a * b;
        int d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        do {
            System.out.println("Intente adivinar un número entre 0 y 100");
            d = leer.nextInt();
                if (d == c){
                    System.out.println("Ha adivinado");
                } else {
                    System.out.println("No ha adivinado. Intente nuevamente");
                }
        } while (d != c);
         
    }
    
}
