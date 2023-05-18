package Entidades;

public class Ahorcado {
    
    char[] palabraBuscada;
    int cantLetrasEncontradas;
    int cantJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscada, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.palabraBuscada = palabraBuscada;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public char[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(char[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }
    
    
}
