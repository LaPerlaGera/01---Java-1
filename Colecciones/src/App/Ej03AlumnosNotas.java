package App;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;



public class Ej03AlumnosNotas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        AlumnoServicio serv = new AlumnoServicio();
        boolean seguirAgregando = true;
        while (seguirAgregando){
            alumnos.add(serv.crearAlumno());
            System.out.println("¿Quiere agregar otro alumno? (s/n): ");
            String respuesta = leer.nextLine();
            seguirAgregando = respuesta.equalsIgnoreCase("s");
        }
        System.out.println("Ingrese el nombre del alumno que desea calcular su nota final:");
        String nombreAlumno = leer.nextLine();
        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)){
                encontrado = true;
                double promedio = serv.notaFinal(alumno.getNotas());
                System.out.println("El promedio de " + alumno.getNombre() + " es: "+ promedio);
                break;
            }
        }
        if (!encontrado){
            System.out.println("No se encontró el alumno");
        }
        
    }
    
}
