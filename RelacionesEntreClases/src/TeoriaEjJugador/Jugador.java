/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package TeoriaEjJugador;

public class Jugador {
    private String nombre;
    private String apellido;
    private String posicion;
    private int numero;

    public Jugador(String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
