package TeoriaEjJugador;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> jugadores;
    
    public Equipo(){
        jugadores = new ArrayList();
    }
    
    
    public void agregarJugador(Jugador jugador){
            jugadores.add(jugador);
        }
    
    public void mostrarJugadores(){
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Apellido: " + jugador.getApellido());
            System.out.println("Posición: " + jugador.getPosicion());
            System.out.println("Número: " + jugador.getNumero());
            System.out.println("************************");
        }
    }
    
    
}
