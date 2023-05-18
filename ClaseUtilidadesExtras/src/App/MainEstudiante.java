package App;

import Entidades.Estudiante;
import Servicios.EstudianteService;

public class MainEstudiante {

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("María", 8.0);
        estudiantes[2] = new Estudiante("Pedro", 6.5);
        estudiantes[3] = new Estudiante("Ana", 9.0);
        estudiantes[4] = new Estudiante("Luis", 7.0);
        estudiantes[5] = new Estudiante("Laura", 8.5);
        estudiantes[6] = new Estudiante("Carlos", 6.0);
        estudiantes[7] = new Estudiante("Sofía", 9.5);
        EstudianteService serv = new EstudianteService();
        System.out.println("El promedio de notas del curso es: " + serv.promedioNotas(estudiantes));

        serv.estudiantesMayorAlPromedio(estudiantes);
        serv.mostrarEstudiantesMayorAlPromedio(estudiantes);
        
        
    }
    
}
