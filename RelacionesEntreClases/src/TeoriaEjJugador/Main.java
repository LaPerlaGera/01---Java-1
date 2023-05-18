package TeoriaEjJugador;

public class Main {

    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        
        Jugador jugador1 = new Jugador("Martín", "Palermo", "Delantero", 9);
        Jugador jugador2 = new Jugador("Román", "Riquelme", "Volante", 10);
        Jugador jugador3 = new Jugador("Oscar", "Córdoba", "Arquero", 1);
        
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        
        equipo.mostrarJugadores();
    }
    
}
