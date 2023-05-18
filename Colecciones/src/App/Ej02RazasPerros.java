package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ej02RazasPerros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> listaRazaPerro = new ArrayList();
        boolean opcion = true;
        do {
            System.out.println("Ingrese una raza de perro");
            String raza = leer.nextLine();
            listaRazaPerro.add(raza);
            System.out.println("Digite ´s´ si quiere ingresar otra raza o ´n´ si quiere salir");
            char eleccion = leer.nextLine().charAt(0);
            while (eleccion != 's' && eleccion != 'n'){
                System.out.println("opcion invalida. Digite ´s´ si quiere ingresar otra raza o ´n´ si quiere salir");
                eleccion = leer.nextLine().charAt(0);
            }
            if (eleccion == 'n'){
                opcion = false;
            }
        }while (opcion == true) ;
        System.out.println("La lista de raza de perros ingresada es:");
        for (String raza : listaRazaPerro) {
            System.out.println(raza);
        }
        
        System.out.println("Ingrese una raza para saber si esta en la lista y eliminarla");
        String raza = leer.nextLine();
        Iterator iterador = listaRazaPerro.iterator();
        int contador = 0;
        while (iterador.hasNext()){
            if(iterador.next().equals(raza)){
                iterador.remove();
                contador ++;
            }
        }
        if (contador == 0){
            System.out.println("El perro no se encuentra en la lista");
        } else {
            Collections.sort(listaRazaPerro);
            for (String raz : listaRazaPerro) {
            System.out.println(raz);
        }
        }
        
        
    }
    
}
