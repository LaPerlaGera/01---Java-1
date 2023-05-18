package Servicio;

import Entidad.Ej02Cafetera;
import java.util.Scanner;

public class Ej02CafeteraServicio {
    Ej02Cafetera cafetera = new Ej02Cafetera();
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera esta llena, su capacidad es de " + cafetera.getCantidadActual() + " ml");
    }
    
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza");
        int tamañoTaza = leer.nextInt();
        if (cafetera.getCantidadActual() == 0){
            System.out.println("La cafetera está vacía, no se pudo servir.");
        } else if (tamañoTaza <= cafetera.getCantidadActual()){
            System.out.println("La taza se ha llenado");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("A la cafetera le quedan " + cafetera.getCantidadActual() + " ml");
        } else {
            tamañoTaza = cafetera.getCantidadActual();
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("La taza se llenó hasta " + tamañoTaza + " ml");
            System.out.println("A la cafetera le quedan " + cafetera.getCantidadActual() + " ml");
        }
    } 
    
    public void vaciarCafetera(){
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera está vacía");
    }
    
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe que ingresa a la cafetera");
        cafetera.setCantidadActual(leer.nextInt());
    }
}
