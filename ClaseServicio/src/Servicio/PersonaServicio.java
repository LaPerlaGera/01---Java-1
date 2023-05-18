package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona per1 = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        per1.setNombre(leer.next());
        return per1;
    } 
    
    public void mostrarAtributos(Persona x){
        System.out.println("El nombre de la persona es:"+x.getNombre());
        System.out.println("La edad de la persona es:"+x.getEdad());
        System.out.println(x.toString());
    }
    
    
}
