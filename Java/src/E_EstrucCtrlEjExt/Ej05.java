package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
        */
        Scanner leer =  new Scanner(System.in);
        char A, B, C;
        System.out.println("Ingrese la letra de su clase de socio: A, B o C");
        char socio = leer.next().charAt(0);
        System.out.println("Ingrese el valor de su tratamiento");
        double valor = leer.nextDouble();
        
        switch (socio){
                case 'A':
                    System.out.println("El valor de su tratamiento con el descuento es de $ " + valor * 0.5);
                    break;
                case 'B':
                    System.out.println("El valor de su tratamiento con el descuento es de $ " + valor * 0.65);
                    break;
                case 'C':    
                    System.out.println("El valor de su tratamiento con el descuento es de $ " + valor);
                    break;
                default:
                    System.out.println("La letra ingresada no corresponde a un socio");
        }
    }
    
}
