package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void crearPelicula(){
        System.out.println("Ingrese el título de la película");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el nombre del director de la película");
        String director = leer.nextLine();
        System.out.println("Ingrese la duración de la película");
        float duracion = leer.nextFloat();
        leer.nextLine();
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        peliculas.add(pelicula);
        System.out.println("Desea crear otra pelicula? (s/n)");
        String opcion = leer.nextLine();
        if (opcion.equalsIgnoreCase("s")){
            crearPelicula();
        }
        
    }
    
    public void mostrarPeliculas(){
        System.out.println("Lista de Peliculas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + " - " + "Director: " + pelicula.getDirector() + " - " + "Duración: " + pelicula.getDuracion());
        }
    }
    
    public void mostrarPeliculasMayor1Hora(){
        System.out.println("Lista de películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas){
            if(pelicula.getDuracion() > 1){
                System.out.println("Título: " + pelicula.getTitulo() + " - " + "Director: " + pelicula.getDirector() + " - " + "Duración: " + pelicula.getDuracion());
            }
        }
    }
    
    public void ordenarPeliculasPorDuracionMayorAMenor(){
        System.out.println("Lista de películas ordenadas según su duración de mayor a menor:");
        Collections.sort(peliculas, Pelicula.compararPeliculaDescendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + " - " + "Director: " + pelicula.getDirector() + " - " + "Duración: " + pelicula.getDuracion());
        }
    }
    
    public void ordenarPeliculasPorDuracionMenorAMayor(){
        System.out.println("Lista de películas ordenadas según su duración de menor a mayor:");
        Collections.sort(peliculas, Pelicula.compararPeliculaAscendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + " - " + "Director: " + pelicula.getDirector() + " - " + "Duración: " + pelicula.getDuracion());
        }
    }
    
    public void ordenarPeliculasPorTitulo(){
        System.out.println("Lista de películas ordenadas alfabéticamente según su título");
        Collections.sort(peliculas, Pelicula.compararPeliculaTitulo);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + " - " + "Director: " + pelicula.getDirector() + " - " + "Duración: " + pelicula.getDuracion());
        }
    }
    
    public void ordenarPeliculasPorDirector(){
        System.out.println("Lista de películas ordenadas alfabéticamente según su director");
        Collections.sort(peliculas, Pelicula.compararPeliculaDirector);
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + " - " + "Director: " + pelicula.getDirector() + " - " + "Duración: " + pelicula.getDuracion());
            }
    }
}
