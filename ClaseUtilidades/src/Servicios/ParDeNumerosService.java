package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {
    
    ParDeNumeros serv = new ParDeNumeros();
    
    public void mostrarValores(){
        System.out.println("El primer número es " + serv.getNum1());
        System.out.println("El segundo número es " + serv.getNum2());
    }
    
    public void devolverMayor(){
        if (serv.getNum1() > serv.getNum2()){
            System.out.println("El primer atributo es mayor al segundo");
        } else if (serv.getNum1() < serv.getNum2()){
            System.out.println("El segundo atributo es mayor al primero");
        } else {
            System.out.println("Ambos atributos son iguales");
        }
    }
    
    public void calcularPotencia(){
        serv.setNum1(Math.round(serv.getNum1()));
        serv.setNum2(Math.round(serv.getNum2()));
        double potencia = Math.pow(Double.max(serv.getNum1(), serv.getNum2()), Double.min(serv.getNum1(), serv.getNum2()));
        System.out.println("La potencia del mayor número absoluto elevado al menor absoluto es " + potencia);
    }
    
    public void calcularRaiz(){
        double absoluto = Math.abs(Double.min(serv.getNum1(), serv.getNum2()));
        absoluto = Math.sqrt(absoluto);
        System.out.println("La raiz cuadrada del menor valor es " + absoluto);
    }
}
