package Main;

import Entidad.EjExt02Puntos;

public class EjExt02 {
    
    public static void main(String[] args) {
        EjExt02Puntos Punto = new EjExt02Puntos();
        Punto.CrearPuntos();
        Punto.CalcularDistancia();
        System.out.println("La coordenada del punto 1 es: "+Punto.getX1()+","+Punto.getY1());
        System.out.println("La coordenada del punto 2 es: "+Punto.getX2()+","+Punto.getY2());
        System.out.println("La distancia entre los puntos es: "+Punto.CalcularDistancia());
    }
}
