package App;

import Servicios.ArregloService;

public class MainArreglo {
    
    public static void main(String[] args) {
        
        ArregloService serv = new ArregloService();
    
        double[] arreglo1 = new double[50];
        double[] arreglo2 = new double[20];
        
        arreglo1 = serv.inicializarA(arreglo1);
        System.out.println("Arreglo 1");
        serv.mostrar(arreglo1);
        System.out.println("Arreglo 1 ordenado");
        serv.ordenar(arreglo1);
        serv.inicializarB(arreglo1, arreglo2);
        System.out.println("Arreglo 1");
        serv.mostrar(arreglo1);
        System.out.println("Arreglo 2");
        serv.mostrar(arreglo2);
        
    }
}
