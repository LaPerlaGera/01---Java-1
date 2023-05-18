package App;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class MetodoVoid {

    public static void main(String[] args) {
        PersonaServicio personas = new PersonaServicio();
        Persona per1 = personas.crearPersona();
        personas.mostrarAtributos(per1);
    }
    
}
