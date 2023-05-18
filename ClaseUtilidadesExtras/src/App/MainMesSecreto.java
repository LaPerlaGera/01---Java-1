package App;

import java.util.Scanner;

public class MainMesSecreto {

    public static void main(String[] args) {
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = meses[9];
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String respuesta = leer.nextLine();
        if (mesSecreto.equals(respuesta)){
            System.out.println("¡Ha acertado!");
        } else {
            do{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                respuesta = leer.nextLine();
                if (mesSecreto.equals(respuesta)){
                System.out.println("¡Ha acertado!");
                } 
            } while (!mesSecreto.equals(respuesta));
        }
    }    
}
