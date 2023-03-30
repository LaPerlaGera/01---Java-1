package B_IntroJavaEj;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        int gradosCent;
        System.out.println("Ingrese la cantidad de grados centígrados");
        gradosCent = leer.nextInt();
        int gradosFaren;
        gradosFaren = 32 + (9 * gradosCent/5);
        System.out.println("El equivalente en grado Fahrenheit es " + gradosFaren);
    }
    
}
