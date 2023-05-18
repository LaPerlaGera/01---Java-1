package Teoria;

import java.util.ArrayList;

public class ListaLibros {

    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList();
        Libro libro1 = new Libro("Gera", "La oveja negra");
        Libro libro2 = new Libro("Lucas", "La perla inquieta");
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
    
}
