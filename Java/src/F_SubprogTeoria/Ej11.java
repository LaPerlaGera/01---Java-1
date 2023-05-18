/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package F_SubprogTeoria;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase para ser codificada");
        String frase = leer.nextLine();
        String frasecod = codificador(frase);
        System.out.println(frasecod);
    }
    
    public static String codificador(String a){
        String codificada = "";
        char caracter;
        for (int i = 0; i < a.length(); i++) {
            caracter = a.charAt(i);
            switch (caracter){
                case 'a':
                case 'A':
                case 'á':
                case 'Á':    
                    codificada += '@';
                    continue;
                case 'e':
                    codificada += '#';
                    continue;
                case 'i':
                    codificada += '$';
                    continue;
                case 'o':
                    codificada += '%';
                    continue;
                case 'u':
                    codificada += '*';
                    continue;
                default:
                    codificada += caracter;
            }
        }
    return codificada;
} 
    
}
    
