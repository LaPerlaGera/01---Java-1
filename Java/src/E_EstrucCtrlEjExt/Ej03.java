package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("La letra ingresada en una vocal");
        } else{
            System.out.println("La letra ingresada no es una vocal");
            
        }
    }
    
}
