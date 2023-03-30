package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int n = leer.nextInt();
        int horas = n / 60;
        int dias = horas / 24;
        horas = horas % 24;
        System.out.println("El tiempo ingresado equivale a: " + dias + " día/s y " + horas + " horas");
    }
    
}
