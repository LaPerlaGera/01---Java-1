package Servicios;

import java.util.Arrays;

public class ArregloService {

    public double[] inicializarA(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 100;
        }
        return arreglo;
    }
    
    public void mostrar(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " ");
        }
    }
    
    public void ordenar(double[] arreglo){
        Arrays.sort(arreglo);
    }
    
    public double[] inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, 20, 0.5);
        return arregloB;
    }
}
