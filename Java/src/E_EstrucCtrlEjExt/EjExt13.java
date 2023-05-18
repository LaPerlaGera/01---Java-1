/*
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
 */
package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class EjExt13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        int num = leer.nextInt();
        String fullnum = "";
        for (int i = 0; i < num; i++) {
            fullnum += String.valueOf(i+1);
            System.out.println(fullnum);
        }
                
    }
    
}
