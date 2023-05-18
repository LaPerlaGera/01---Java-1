package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    
    Cadena serv = new Cadena();
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(String frase){
        int cantVocales = 0;
        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if ("aeiou".contains(String.valueOf(letra).toLowerCase())){
                cantVocales++;
            }
        }
        System.out.println("La frase ingresada tiene "+ cantVocales + " vocales");
    }
    
    public void invertirFrase(String frase){
        String fraseInvertida = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }
        System.out.println("La frase invertida es " + fraseInvertida);
    }
        
    public void vecesRepetido(char letra, String frase){
        int cantLetra = 0;
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == letra){
                cantLetra++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + cantLetra + " veces.");
    }
    
    public void compararLongitud(String frase1, String frase2){
        int longitudFrase1 = frase1.length();
        int longitudFrase2 = frase2.length();
        if (longitudFrase1 > longitudFrase2){
            System.out.println("La frase original es más larga que la nueva frase");
        } else if (longitudFrase1 < longitudFrase2) {
            System.out.println("La nueva frase es más larga que la frase original");
        } else{
            System.out.println("Ambas frases tienen la misma longitud");
        }
    }
    
    public void unirFrases(String frase1, String frase2){
        System.out.println("La frase resultante de unir ambas frases es: " + (frase1+frase2));
    }
    
    public String reemplazar(String letra, String frase){
        return frase.replace("a", letra);
    }
    
    public boolean contiene(String letra, String frase){
        return frase.indexOf(letra) >= 0;
    }
        
}
