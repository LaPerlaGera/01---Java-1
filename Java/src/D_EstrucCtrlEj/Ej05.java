package D_EstrucCtrlEj;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        double limite = leer.nextDouble(), sum = 0;
        do {
            System.out.println("Ingrese un numero");
            sum = sum + leer.nextDouble();
        } while (limite >= sum);
        System.out.println("La suma de los valores ingresados es de " + sum);
    }
        
    }
