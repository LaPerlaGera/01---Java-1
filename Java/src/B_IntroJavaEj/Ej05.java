package B_IntroJavaEj;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().*/
        Scanner leer = new Scanner(System.in);
        int num, num2, num3;
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        num2 = num * 2;
        num3 = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del número ingresado es " + num2);
        System.out.println("El triple del número ingresado es " + num3);
        System.out.println("La raíz cuadrada del número ingresado es " + raiz);
        
    }
    
}
