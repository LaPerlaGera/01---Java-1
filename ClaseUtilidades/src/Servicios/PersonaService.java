package Servicios;

import Entidades.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la fecha de nacimiento en formato dd/mm/yyyy");
        String fechaNacString = leer.nextLine();
        Date fechaNac = null;
        try {
            fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacString);
        } catch (ParseException e){
            System.out.println("La fecha ingresa no es válida");
            System.exit(1);
        }
        return new Persona(nombre,fechaNac);
    }
    
    public int calcularEdad(Date fechaNac){
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(fechaNac);
        
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        
        if(fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }
        
        return edad;
    }
    
    public boolean menorQue(Persona a, int edad){
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(a.getFechaNac());
        int edadPersona = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if(fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)){
            edadPersona--;
        }
        boolean menor;
        menor = edadPersona < edad; //el ejercio pide edad menor v o f, pero puede ser igual por eso se considera menor
        return menor;
    }
    
    public void mostrarPersona(Persona a){
        System.out.println(a.toString());
    }
    
}
