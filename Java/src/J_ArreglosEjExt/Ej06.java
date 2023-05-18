/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package J_ArreglosEjExt;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] palabras = new String[5];
        
        // Pedir al usuario que ingrese las palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = input.nextLine().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
                palabras[i] = input.nextLine().toUpperCase();
            }
        }
        
        // Crear la sopa de letras
        char[][] sopa = new char[20][20];
        System.out.println(sopa.length);
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = (char)(Math.random() * 10 + '0'); // Llenar con número aleatorio del 0 al 9
                System.out.print(sopa[i][j]);
            }
        }
        
        // Elegir la fila donde se ubicarán las palabras
        int fila = (int)(Math.random() * sopa.length);
        
        // Colocar las palabras en la fila seleccionada
        int pos = 0; // posición en la fila
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                sopa[fila][pos + j] = palabras[i].charAt(j);
            }
            pos += palabras[i].length() + 1; // dejar un espacio entre las palabras
        }
        
        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
