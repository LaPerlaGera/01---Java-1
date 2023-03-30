package C_EstrucCtrl;

import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.*/
        Scanner leer = new Scanner(System.in);
        double numero, suma = 0;
        int contar = 0;
        do {
            System.out.println("Ingrese un número");
            numero = leer.nextDouble();
            suma = suma + numero;
            contar = contar + 1;
        } while (numero != 0 && numero < 20);
        if (numero == 0) {
            System.out.println("Se capturó el número cero");
            System.out.println("La suma de los números leídos es de " + suma);
        }
        else {
            System.out.println("La suma de los números leídos es de " + suma);
        }
    }
    
}
