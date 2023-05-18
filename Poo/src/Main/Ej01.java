package Main;

import Entidad.Ej01Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Ej01Libro libro1 = new Ej01Libro();
        
        System.out.println("***Ingrese los datos del libro***");
        System.out.println("ISBN: ");
        libro1.setISBN(leer.nextInt());
        System.out.println("Autor: ");
        libro1.setAutor(leer.next());
        System.out.println("Título: ");
        libro1.setTitulo(leer.next());
        System.out.println("Números de páginas: ");
        libro1.setNumpag(leer.nextInt());
        
        
        System.out.println(libro1);
    }
    
}
