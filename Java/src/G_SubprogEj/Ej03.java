/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package G_SubprogEj;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double cantidad;
        String moneda = "€", eleccion;
        System.out.println("Ingrese la cantidad de euros que desea convertir a libras, dólares o yenes");
        cantidad = leer.nextInt();
        do {
        System.out.println("Elija a que moneda desea convertirlos");
        System.out.println("Digite (libras) para libras");
        System.out.println("Digite ($) para dólares");
        System.out.println("Digite (yenes) para yenes");
        eleccion = leer.next();
            if (! eleccion.equals("libras") && ! eleccion.equals("$") && ! eleccion.equals("yenes")){
            System.out.println("opción invalida");
            }
        } while (! eleccion.equals("libras") && ! eleccion.equals("$") && ! eleccion.equals("yenes"));
        convertidor(eleccion, cantidad);
    }    
    
    public static void convertidor(String mon, double cant){
        switch (mon){
            case "libras":
            System.out.println("Equivalen a "+ cant * 0.86 + " libras");
            break;
            case "$":
            System.out.println("Equivalen a "+ (cant * 1.28611) + " dólares");
            break;
            case "yenes":
            System.out.println("Equivalen a "+ cant * 129.852 + " yenes");
            break;
        }
    }
}
