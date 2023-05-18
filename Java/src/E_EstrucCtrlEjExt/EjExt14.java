/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class EjExt14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familia");
        int familias = leer.nextInt();
        int sumaedad = 0, sumacant = 0;
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+(i+1));
            int hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad de su hijo "+(j+1));
                int edad = leer.nextInt();
                sumaedad += edad;
                sumacant++;
            }
        }
        System.out.println("La medida de edad de los hijos de todas las familias es "+(sumaedad / sumacant));
    }
    
}
