package TeoriaEjPersona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Dni dni = new Dni('A', 123456);
        Persona pers = new Persona("Tito", "Fantoche", dni);
        
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Apellido: " + pers.getApellido());
        System.out.println("DNI - serie: " + pers.getDni().getSerie());
        System.out.println("DNI - serie: " + pers.getDni().getNumero());
    }
    
}
