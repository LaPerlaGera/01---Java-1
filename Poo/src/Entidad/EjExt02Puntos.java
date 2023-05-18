/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2))
 */
package Entidad;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class EjExt02Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public void CrearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del punto 1");
        x1 = leer.nextInt();
        System.out.println("Ingrese la coordenada y del punto 1");
        y1 = leer.nextInt();
        System.out.println("Ingrese la coordenada x del punto 2");
        x2 = leer.nextInt();
        System.out.println("Ingrese la coordenada y del punto 2");
        y2 = leer.nextInt();
    }
    
    public double CalcularDistancia(){
        double distancia;
        distancia = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return distancia;
    }

    public EjExt02Puntos() {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

}
