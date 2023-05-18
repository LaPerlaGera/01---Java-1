package Servicios;

import Entidades.Curso;
import java.util.Scanner;


public class CursoService {
    
    Scanner leer = new Scanner(System.in);
    Curso conexion = new Curso();
    
    public String[] cargarAlumnos(){
        String[] nombres = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del Alumno " + (i+1) + "/5");
            nombres[i] = leer.nextLine();
        }
        return nombres;
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día del curso");
        int horasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de días por semana del curso");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno del curso:");
        System.out.println("Ingrese (M) para turno mañana");
        System.out.println("Ingrese (T) para turno tarde");
        char turno = leer.next().charAt(0);
        System.out.println("Ingrese el precio por hora del curso");
        double precioPorHora = leer.nextDouble();
        leer.nextLine();
        String[] alumnos = cargarAlumnos();
        return new Curso(nombre, horasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
    }
    
    public double calcularGananciaSemana(Curso objeto){
        int contadorAlumnos = 0;
        for (int i = 0; i < 5; i++) {
            if (!objeto.getAlumnos()[i].isEmpty()){
                contadorAlumnos++;
            }
        }
        System.out.println(contadorAlumnos);
        double ganancia = objeto.getCantidadHorasPorDia() * objeto.getPrecioPorHora() * contadorAlumnos * objeto.getCantidadDiasPorSemana();
        return ganancia;
    }
    
    
}
