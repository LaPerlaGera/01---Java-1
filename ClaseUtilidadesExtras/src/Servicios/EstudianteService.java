package Servicios;

import Entidades.Estudiante;

public class EstudianteService {
    
    public double promedioNotas(Estudiante[] estudiantes){
        double sumaNotas = 0;
        for (Estudiante elemento:estudiantes) {
            sumaNotas += elemento.getNota();
        }
        double promedioNotas = sumaNotas / estudiantes.length;
        return promedioNotas;
    }
    
    public String[] estudiantesMayorAlPromedio(Estudiante[] estudiantes){
        double promedio = promedioNotas(estudiantes);
        String[] nombreMayorAlPromedio = new String[estudiantes.length];
        int contador = 0;
        for (Estudiante elemento : estudiantes) {
            if (elemento.getNota() > promedio){
                nombreMayorAlPromedio[contador] = elemento.getNombre();
                contador++;
            }
        }
        String[] nombreMayorAlPromedioDepurado = new String[contador];
        for (int i = 0; i < contador; i++) {
            nombreMayorAlPromedioDepurado[i] = nombreMayorAlPromedio[i];
        }
        return nombreMayorAlPromedioDepurado;
    }
    
    public void mostrarEstudiantesMayorAlPromedio(Estudiante[] estudiantes){
        String[] estudiantesMayorAlPromedio = estudiantesMayorAlPromedio(estudiantes);
        System.out.println("Los siguientes estudiantes tienen mayor nota al promedio:");
        for (String elemento : estudiantesMayorAlPromedio) {
            System.out.println(elemento);
        }
    }
}
