/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package G_SubprogEj;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String freno;
        do {
            evaluacionEdad();
            System.out.println("Si no quiere seguir mostrando personas ingrese No");
            freno = leer.next();
        } while (! freno.equals("No"));
        
    }
    
    public static void evaluacionEdad(){
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("ingrese su edad");
        edad = leer.nextInt();
        if (edad < 18){
            System.out.println("La persona "+nombre+" de edad "+edad+" es menor de edad");
        }else {
            System.out.println("La persona "+nombre+" de edad "+edad+" es mayor de edad");
        }
    }
}
