package App;

import Entidad.Ej03Persona;
import Servicio.Ej03PersonaServicio;

public class Ej03PersonaApp {

    public static void main(String[] args) {
        Ej03PersonaServicio ServPers = new Ej03PersonaServicio();
        
        Ej03Persona persona1 = ServPers.crearPersona();
        ServPers.calcularIMC(persona1.getPeso(), persona1.getAltura());
        System.out.println(ServPers.esMayorDeEdad(persona1.getEdad()));
        System.out.println(persona1.toString());
        
        
        
    }
    
}
