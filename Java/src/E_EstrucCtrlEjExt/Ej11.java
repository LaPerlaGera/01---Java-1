/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, contador = 0;
        System.out.println("Ingrese un número entero para saber cuantos dígitos tiene");
        num = leer.nextInt();
        do{
            contador++;
            num = num / 10;
        } while (num > 0);
        System.out.println("La cantidad de dígitos del número ingresado es de "+contador);
    }
    
}
