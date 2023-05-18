package App;

import java.util.Scanner;
import Servicio.Ej02CafeteraServicio;

public class Ej02Cafetera {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ej02CafeteraServicio cafetera = new Ej02CafeteraServicio();
        boolean ingreso = true;
        do{
            System.out.println("*****MENU*****");
            System.out.println("(1) - LLENAR CAFETERA");
            System.out.println("(2) - SERVIR TAZA");
            System.out.println("(3) - VACIAR CAFETERA");
            System.out.println("(4) - AGREGAR CAFE");
            System.out.println("(5) - SALIR");
            int opcion = leer.nextInt();
            if (opcion >= 1 && opcion <=5 ){
                switch (opcion){
                    case 1:
                        cafetera.llenarCafetera();
                        break;
                    case 2:
                        cafetera.servirTaza();
                        break;
                    case 3:
                        cafetera.vaciarCafetera();
                        break;
                    case 4:
                        cafetera.agregarCafe();
                        break;
                    case 5:
                        ingreso = false;
                }    
            } else {
                System.out.println("Opción invalida. Vuelva a seleccionar");
            } 
        } while (ingreso == true);
        
    }
}
