package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
*/
        Scanner leer = new Scanner(System.in);
        String[] unidades = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        
        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();
        
        if (num < 1 || num > 10){
            System.out.println("Número inválido");
        } else {
            int posunid = num % 10;
            int posdec = num / 10;
            System.out.println("El número ingresado " + num + " equivale en números romanos a " + decenas[posdec]+unidades[posunid]);
        }
    }
}
    