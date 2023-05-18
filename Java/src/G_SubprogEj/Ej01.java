/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package G_SubprogEj;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("Que operación desea hacer");
        System.out.println("Ingrese 1 para sumar");
        System.out.println("Ingrese 2 para restar");
        System.out.println("Ingrese 3 para multiplicar");
        System.out.println("Ingrese 4 para dividir");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                System.out.println(sumar(num1, num2));
                break;
            case 2:
                System.out.println(restar(num1, num2));
                break;
            case 3:
                System.out.println(multiplicar(num1, num2));
                break;
            case 4:
                System.out.println(dividir(num1,num2));
                break;
            default:
                System.out.println("opción inválida");
        }
    }
    
    public static int sumar(int n1, int n2){
    return n1 + n2;
    }
    
    public static int restar(int n1, int n2){
    return n1 - n2;
    }
    
    public static int multiplicar(int n1, int n2){
    return n1 * n2;
    }
    
    public static int dividir(int n1, int n2){
    return n1 / n2;
    }
}
