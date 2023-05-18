/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package F_SubprogTeoria;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int a, int b){
        if (a % b == 0){
            System.out.println("El primer número ingresado en múltiplo del segundo");
        } else {
            System.out.println("El primer número ingresado no es múltiplo del segundo");
        }
}
    
}
