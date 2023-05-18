package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, n, nPar = 0, nImpar = 0, cant = 0;


        /*System.out.println("Ingrese la cantidad de numeros: ");
        n = leer.nextInt();*/

        do {
            System.out.println("Escriba un numero: ");
            num = leer.nextInt();

            if (num < 0) {
                continue;
            } else if (num % 2 == 0) {
                nPar += 1;
            } else {
                nImpar += 1;
            }
            cant++;

        } while (num % 5 != 0);

        System.out.println("La cantidad de numeros pares leidos es: " + nPar);
        System.out.println("La cantidad de numeros impares leidos es: " + nImpar);
        System.out.println("La cantidad de numeros totales leidos es: " + cant);

    }
}