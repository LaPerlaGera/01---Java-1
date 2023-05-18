/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

public class EjExt03JuegoFinal {
    private int numJugador1;
    private int numIntentos;
    private int ganador;
    private int numJugador2;
    private int puntajeJug1;
    private int puntajeJug2;
    
    public EjExt03JuegoFinal() {
    }

    
    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);
        boolean jugarOtro = true;
        int contadorJuego = 1;

        while (jugarOtro) {
            System.out.println("Juego #" + contadorJuego);
            System.out.print("Jugador 1, por favor ingrese un número entre 1 y 100: ");
            numJugador1 = sc.nextInt();

            while (numJugador1 < 1 || numJugador1 > 100) {
                System.out.print("Número inválido. Por favor ingrese un número entre 1 y 100: ");
                numJugador1 = sc.nextInt();
            }

            numIntentos = 0;
            ganador = 0;
            numJugador2 = 0;

            System.out.println("Jugador 2, adivina el número entre 1 y 100.");
            while (numJugador2 != numJugador1 && numIntentos < 10) {
                System.out.print("Intento #" + (numIntentos + 1) + ": ");
                numJugador2 = sc.nextInt();

                while (numJugador2 < 1 || numJugador2 > 100) {
                    System.out.print("Número inválido. Por favor ingrese un número entre 1 y 100: ");
                    numJugador2 = sc.nextInt();
                }

                if (numJugador2 < numJugador1) {
                    System.out.println("Más alto.");
                } else if (numJugador2 > numJugador1) {
                    System.out.println("Más bajo.");
                } else {
                    ganador = 2;
                    System.out.println("¡Felicidades! ¡Has adivinado el número en " + (numIntentos + 1) + " intentos!");
                }

                numIntentos++;
            }

            if (ganador == 0) {
                System.out.println("Lo siento, no has adivinado el número en los 10 intentos.");
                System.out.println("Jugador 1 gana.");
                puntajeJug1++;
            } else if (ganador == 2) {
                System.out.println("Jugador 2 gana.");
                puntajeJug2++;
            }

            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            String respuesta = sc.next();

            while (!respuesta.equals("s") && !respuesta.equals("n")) {
                System.out.print("Respuesta inválida. ¿Quieres jugar otra vez? (s/n): ");
                respuesta = sc.next();
            }

            if (respuesta.equals("n")) {
                jugarOtro = false;
            } else {
                contadorJuego++;
            }
        }
        if (puntajeJug1 > puntajeJug2){
            System.out.println("El Jugador 1 gana la partida con un total de: "+puntajeJug1+" puntos");
            System.out.println("El Jugador 2 obtuvo: "+puntajeJug2+" puntos");
        } else if (puntajeJug1 < puntajeJug2){
            System.out.println("El Jugador 2 gana la partida con un total de: "+puntajeJug2+" puntos");
            System.out.println("El Jugador 1 obtuvo: "+puntajeJug1+" puntos");
        } else {
            System.out.println("La partida a termnido empatada en "+puntajeJug1+" puntos");
        }
        
    }
}
