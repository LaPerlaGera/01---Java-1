package Main;

import Entidad.Ej04Rectangulo;

public class Ej04 {

    public static void main(String[] args) {
        Ej04Rectangulo Rect1 = new Ej04Rectangulo();
        Rect1.CrearRectangulo();
        System.out.println("El area es "+Rect1.CalculoSuperficie());
        System.out.println("El perimetro es "+Rect1.CalculoPerimetro());
        Rect1.DibujarRectangulo();
    }
    
}
