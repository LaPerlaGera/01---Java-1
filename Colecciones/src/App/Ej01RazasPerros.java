package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej01RazasPerros {

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
    }
    
}
