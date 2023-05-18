package C_EstrucCtrlTeoria;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        /*Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un número entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero");
        num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        }
        else {
            if (num1 > 25 && num2 < 25){
                System.out.println("Sólo el primer número es mayor a 25");
            }
            else {
                if (num1 < 25 && num2 > 25){
                    System.out.println("Sólo el segundo número es mayor a 25");
            }
                else {
                    System.out.println("Ningún número es mayor a 25");
                }
            }
        }
    }
    
}
