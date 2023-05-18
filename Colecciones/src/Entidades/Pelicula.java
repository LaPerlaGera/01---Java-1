package Entidades;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> compararPeliculaDescendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return Float.compare(p2.getDuracion(),p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararPeliculaAscendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return Float.compare(p1.getDuracion(),p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararPeliculaTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararPeliculaDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
