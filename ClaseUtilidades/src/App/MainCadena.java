package App;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class MainCadena {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CadenaServicio serv = new CadenaServicio();
        
        System.out.println("Ingrese una frase");
        String frase1 = leer.nextLine();
        Cadena fraseOriginal = new Cadena(frase1);
        
        serv.mostrarVocales(fraseOriginal.getFrase());
        serv.invertirFrase(fraseOriginal.getFrase());
        
        System.out.println("Ingrese una letra para saber cuantas veces se repite en la frase original");
        char letra = leer.next().charAt(0);
        leer.nextLine();
        serv.vecesRepetido(letra, fraseOriginal.getFrase());
        
        System.out.println("Ingrese una nueva frase");
        String frase2 = leer.nextLine();
        Cadena fraseNueva = new Cadena(frase2);
        serv.compararLongitud(fraseOriginal.getFrase(), fraseNueva.getFrase());
        
        serv.unirFrases(fraseOriginal.getFrase(), fraseNueva.getFrase());
       
        System.out.println("Ingrese un caracter de reemplazo para las letras a de la frase original");
        String caracterReemplazo = leer.next();
        String fraseModificada = serv.reemplazar(caracterReemplazo, fraseOriginal.getFrase());
        System.out.println("La frase modificada es " + fraseModificada);
        
        System.out.println("Ingrese una letra para saber si la frase original la contiene");
        String letraContiene = leer.next();
        if (serv.contiene(letraContiene, fraseOriginal.getFrase())){
            System.out.println("La frase original contiene la letra " + letraContiene);
        } else {
            System.out.println("La frase original no contiene la letra " + letraContiene);
        }
        
    }
    
}
