/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package H_ArreglosTeoria;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        String[] Equipo = new String[11];
        Scanner leer = new Scanner(System.in);
        Equipo[3] = "Gera";
        Equipo[7] = "Fede";
        for (int i = 0; i < 11; i++) {
            System.out.println(Equipo[i]);
        }
        
    }
    
}
