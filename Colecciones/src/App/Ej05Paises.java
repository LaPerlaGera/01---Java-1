package App;

import Servicios.PaisServicio;
import java.util.Scanner;

public class Ej05Paises {

    public static void main(String[] args) {
        PaisServicio serv = new PaisServicio();
        Scanner leer = new Scanner(System.in);
        
        serv.leerGuardarPaises();
        serv.mostrarPaises();
        serv.mostrarPaisesOdenardos();
        
        System.out.println("Ingrese un país para eliminar");
        String paisAEliminar = leer.nextLine();
        serv.eliminarPais(paisAEliminar);
        serv.mostrarPaises();
        
    }
    
}
