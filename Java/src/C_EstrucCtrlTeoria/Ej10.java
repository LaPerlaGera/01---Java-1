package C_EstrucCtrlTeoria;

import java.util.Scanner;

/*Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class Ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Ingrese 4 números entre 1 y 20");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        if (num1 > 0 && num1 < 21) {
            System.out.print(num1 + " ");
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }   
        }else {
                    System.out.print("El número ingresado es inválido");
                    }
        System.out.println("");
        if (num2 > 0 && num2 < 21) {
            System.out.print(num2 + " ");
            for (int i = 0; i < num2; i++) {
                System.out.print("*");
            }   
        }else {
                    System.out.print("El número ingresado es inválido");
                    }
        System.out.println("");
        if (num3 > 0 && num3 < 21) {
            System.out.print(num3 + " ");
            for (int i = 0; i < num3; i++) {
                System.out.print("*");
            }   
        }else {
                    System.out.print("El número ingresado es inválido");
                    }
        System.out.println("");
        if (num4 > 0 && num4 < 21) {
            System.out.print(num4 + " ");
            for (int i = 0; i < num4; i++) {
                System.out.print("*");
            }   
        }else {
                    System.out.print("El número ingresado es inválido");
                    }
        System.out.println("");
        }
    }
