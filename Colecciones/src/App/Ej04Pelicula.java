package App;

import Servicios.PeliculaServicio;

public class Ej04Pelicula {

    public static void main(String[] args) {
        
        PeliculaServicio serv = new PeliculaServicio();
        serv.crearPelicula();
        System.out.println("===================");
        serv.mostrarPeliculas();
        System.out.println("===================");
        serv.mostrarPeliculasMayor1Hora();
        System.out.println("===================");
        serv.ordenarPeliculasPorDuracionMayorAMenor();
        System.out.println("===================");
        serv.ordenarPeliculasPorDuracionMenorAMayor();
        System.out.println("===================");
        serv.ordenarPeliculasPorTitulo();
        System.out.println("===================");
        serv.ordenarPeliculasPorDirector();
    }
    
}
