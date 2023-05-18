package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);

    public Alumno crearAlumno() {
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.nextLine();
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota " + i + " del alumno: ");
            int nota = leer.nextInt();
            leer.nextLine();
            notas.add(nota);
        }
        return new Alumno(nombre, notas);
    }
    
    public double notaFinal(ArrayList<Integer> notas){
        double suma = 0;
        int cantNotas = notas.size();
        
        for (Integer nota : notas) {
            suma += nota;
        }
        
        double promedio = suma / cantNotas;

        return promedio;
    }
}
