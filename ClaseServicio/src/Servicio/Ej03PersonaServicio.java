package Servicio;

import Entidad.Ej03Persona;
import java.util.Scanner;

public class Ej03PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
    public boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }
    
    public Ej03Persona crearPersona(){
        Ej03Persona persona = new Ej03Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo. (M) Masculino - (F) Femenino - (O) Otro");
        char sexo = leer.next().charAt(0);
        while (sexo != 'M' && sexo != 'F' && sexo != 'O'){
            System.out.println("El valor ingresado es inválido. Vuelva a ingresarlo");
            sexo = leer.next().charAt(0);
        }
        persona.setSexo(sexo);
        System.out.println("Ingrese su peso");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altuar");
        persona.setAltura(leer.nextDouble());
        return persona;
    }
    
    public int calcularIMC(double peso, double altura){
        if (peso / Math.pow(altura, 2) < 20){
            return -1;
        } else if ((peso / Math.pow(altura, 2) > 25)){
            return 1;
        } else {
            return 0;
        }
    }
    
}
