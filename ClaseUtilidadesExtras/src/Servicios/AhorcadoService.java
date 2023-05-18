package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    Ahorcado serv = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra que hay que adivinar en el ahorcado");
        String palabra = leer.nextLine();
        serv.setPalabraBuscada(new char[palabra.length()]);
        serv.setPalabraBuscada(palabra.toCharArray());
        
        System.out.println("Ingrese la cantidad máxima de jugadas");
        int cantMaxJugadas = leer.nextInt();
        
        serv.setCantJugadasMaximas(cantMaxJugadas);
        
        System.out.println("El juego ha sido creado");
        }
    
    public void mostrarLongitud(){
        System.out.println("La longitud de la palabra a encontrar es de " + serv.getPalabraBuscada().length + " caracteres");
    }
    
    public boolean buscar(char letra){
        boolean encontrada = false;
        for (int i = 0; i < serv.getPalabraBuscada().length; i++) {
            if (serv.getPalabraBuscada()[i] == letra){
                encontrada = true;
            }
        }
        if (encontrada){
            System.out.println("La letra " + letra + " está en la palabra");
        } else {
            System.out.println("La letra " + letra + " no está en la palabra");
        }
        return encontrada;
    }
    
    public boolean encontradas(char letra){
        int cantEncontradas = serv.getCantLetrasEncontradas();
        for (int i = 0; i < serv.getPalabraBuscada().length; i++) {
            if (serv.getPalabraBuscada()[i] == letra){
                cantEncontradas++;
            }
        }
        serv.setCantLetrasEncontradas(cantEncontradas);
        System.out.println("La cantidad de letras encontradas: " + serv.getCantLetrasEncontradas());
        System.out.println("La cantidad de letras faltantes: " + (serv.getPalabraBuscada().length - serv.getCantLetrasEncontradas()));
        boolean letraEncontrada = buscar(letra);
        int cantidadMaxima = serv.getCantJugadasMaximas();
        if (!letraEncontrada){
            cantidadMaxima--;
        }
        serv.setCantJugadasMaximas(cantidadMaxima);
        return letraEncontrada;
    }
    
    public void intentos(){
        System.out.println("Le quedan " + serv.getCantJugadasMaximas() + " intentos");
    }
    
    public void juego(){
        crearJuego();
        mostrarLongitud();
        while (serv.getCantJugadasMaximas() > 0 && (serv.getCantLetrasEncontradas() != serv.getPalabraBuscada().length)){
            System.out.println("Ingrese una letra");
            char letra = leer.next().charAt(0);
            encontradas(letra);
            intentos();
        }
        if (serv.getCantLetrasEncontradas() != serv.getPalabraBuscada().length){
            System.out.println("No quedan mas intentos");
        } else {
            System.out.println("Usted ha adivinado");
        }
        
    }
}
