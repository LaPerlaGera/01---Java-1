package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que cantidad de números desea ingresar");
        int cantnum = leer.nextInt();
        int num, limite = 1; 
        double suma = 0, max = Double.NEGATIVE_INFINITY , min = Double.POSITIVE_INFINITY;
        while (limite <= cantnum) {
            System.out.println("Ingrese el número " + limite + " de " + cantnum);
            num = leer.nextInt();
            limite++;
            suma += num;
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        System.out.println("El valor máximo es " + max);
        System.out.println("El valor mínimo es " + min);
        System.out.println("El valor promedio es " + suma / cantnum);
    }
}
