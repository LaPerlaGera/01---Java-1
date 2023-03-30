package B_IntroJavaEj;

import java.util.Scanner;
        
public class Ej01 {

    public static void main(String[] args) {
        /*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/
    Scanner leer = new Scanner(System.in);// se crea variable Scanner para leer datos del usuario
    int num1 = 0;
    int num2 = 0;
    System.out.println("Ingrese un número entero");
    num1 = leer.nextInt();
    System.out.println("Ingrese otro número entero");
    num2 = leer.nextInt();
    int sum = num1 + num2;
    System.out.println("La suma de los números ingresos es de " + sum);
    }
    
}
