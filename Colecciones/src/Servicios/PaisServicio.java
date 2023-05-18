package Servicios;

import Entidades.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {
    
    Scanner leer = new Scanner(System.in);
    Paises paises = new Paises();
    
    public void leerGuardarPaises(){
        String opcion;
        do{
            System.out.println("Ingrese un país: ");
            String pais = leer.nextLine();
            paises.agregarPais(pais);
            System.out.println("Desea ingresar otro país? (S/N):");
            opcion = leer.nextLine();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")){
                System.out.println("Opción inválida. Desea ingresar otro país? (S/N):");
                opcion = leer.nextLine();
            }
        } while (opcion.equalsIgnoreCase("s"));
        
    }
    
    public void mostrarPaises(){
        System.out.println("La lista de paises guardados:");
        for (String pais : paises.getPaises()) {
            System.out.println(". " + pais);
        }
        //System.out.println(paises.toString());
    }
    
    public void mostrarPaisesOdenardos(){
        TreeSet<String> paisesOrdenados = new TreeSet(paises.getPaises());
        System.out.println("La lista de paises guardados ordenados alfabéticamente:");
        for (String pais : paisesOrdenados) {
            System.out.println(". " + pais);
        }
    }
    
    public void eliminarPais(String pais){
        Iterator<String> iterator = paises.getPaises().iterator();
        while (iterator.hasNext()){
            String paisActual = iterator.next();
            if(paisActual.equalsIgnoreCase(pais)){
                iterator.remove();
                System.out.println("El pais " + paisActual + " ha sido eliminado");
                return;
            }
        }
        System.out.println("El pais " + pais + " no se encuentra en la lista");
    }
}
