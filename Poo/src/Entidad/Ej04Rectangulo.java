package Entidad;

import java.util.Scanner;

public class Ej04Rectangulo {
 
    private double base;
    private double altura;

    public Ej04Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Ej04Rectangulo() {
    }
    
    public void CrearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo y luego la altura:");
        base = leer.nextDouble();
        altura = leer.nextDouble();
    }
    
    public double CalculoPerimetro(){
        return (base+altura)*2;
    }
    public double CalculoSuperficie(){
        return base*altura;
    }
    public void DibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1){
                    System.out.print("*");
                }
                else if(j == 0 || j == base-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
        
}
