package D_EstrucCtrlEj;

import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int n = leer.nextInt();
        for (int i = 0; i < 1; i++){
            System.out.print("*");
            for (int j = 0; j < n-1; j++){
                System.out.print(" *");
            }
        }
        System.out.println();
        for (int i=0; i<n-2; i++){
            System.out.print("*");
            for (int j=0; j<n-2; j++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }
       
        for (int i = 0; i < 1; i++){
            System.out.print("*");
            for (int j = 0; j < n-1; j++){
                System.out.print(" *");
            }
        }
        System.out.println();
    }
    
}
