package App;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {
        
        PersonaService serv = new PersonaService();
        
        Persona pers1 = serv.crearPersona();
        int edad = serv.calcularEdad(pers1.getFechaNac());
        System.out.println("Edad = " + edad );
        System.out.println("Ingrese una edad para saber si la persona es menor");
        Scanner leer = new Scanner(System.in);
        int edadNueva = leer.nextInt();
        System.out.println("La persona es menor a la edad ingresada? " + serv.menorQue(pers1, edadNueva));
        serv.mostrarPersona(pers1);
        
        
    }
    
}
