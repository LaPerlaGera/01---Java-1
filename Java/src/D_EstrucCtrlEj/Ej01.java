/*Crear un programa que dado un número determine si es par o impar.
 */
package D_EstrucCtrlEj;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = leer.nextDouble();
        if (num % 2 != 0) {
            System.out.println("El numero ingresado es impar");
        }
        else {
            System.out.println("El numero ingresado es par");
        }
    }
    
}
