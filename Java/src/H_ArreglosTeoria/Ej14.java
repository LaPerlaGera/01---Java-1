/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
package H_ArreglosTeoria;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        String[] Equipo = new String[4];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre "+(i+1)+" de "+4+" de tu equipo");
            Equipo[i] = leer.next();
        }
        System.out.println("Los nombres de tus compañeros de equipo son:");
        for (int i = 0; i < 4; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
