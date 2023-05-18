/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

public class EjExt03Juego {
    int num; //numero que hay que adivinar
    
    int jugador1; //puntaje jugador1
    int jugador2; //puntaje jugador2

    public EjExt03Juego() {
    }
    
    
    public void IniciarJuego(){
        Scanner leer = new Scanner(System.in);
        int num2;
        System.out.println("Jugador 1 - Ingrese un numero del 1 al 10");
        num = leer.nextInt();
        
        for (int i = 1; i < 4; i++) {
            System.out.println("Jugador 2 - Ingrese un numero del 1 al 10"+" intento "+i+" de 3");
            num2 = leer.nextInt();
            
            if ( num2 != num) {
                if (num2 < num){
                    System.out.println("El número es más alto");
                } else {
                    System.out.println("El número es más bajo");
                }
                if (i == 3){
                    System.out.println("No ha adivinado");
                }
            } else {
                System.out.println("Ha adivinado");
                jugador2++;
                break;
            }
        }
    }
}
