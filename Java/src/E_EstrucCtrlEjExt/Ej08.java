package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
*/
        Scanner leer = new Scanner(System.in);
        int cantnum = 0; cantpar = 0;cantimpar = 0;
        do {
        System.out.println("Ingrese números enteros");
        int num = leer.nextInt();
            if (num % 5 = 0){
                break;
            }
            if (num > 0){
            cantnum++;
        }
        
        
        }
    }
    
}
