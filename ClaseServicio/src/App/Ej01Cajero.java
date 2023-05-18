package App;

import Entidad.Ej01CuentaBancaria;
import Servicio.Ej01CuentaBancariaServicio;
import java.util.Scanner;

public class Ej01Cajero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ej01CuentaBancariaServicio cajero = new Ej01CuentaBancariaServicio();
        Ej01CuentaBancaria cuenta1 = cajero.crearCuenta();
        boolean ingreso = true;
        do{
            System.out.println("*****BIENVENIDO AL CAJERO*****");
            System.out.println("(1) - DEPOSITAR");
            System.out.println("(2) - RETIRAR");
            System.out.println("(3) - EXTRACCION RAPIDA");
            System.out.println("(4) - CONSULTAR SALDO");
            System.out.println("(5) - CONSULTAR DATOS");
            System.out.println("(6) - SALIR");
            int opcion = leer.nextInt();
            if (opcion >= 1 && opcion <=6 ){
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese la cantidad a depositar");
                        double cantidad = leer.nextDouble();
                        cajero.ingresar(cantidad, cuenta1);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a retirar");
                        cantidad = leer.nextDouble();
                        cajero.retirar(cantidad, cuenta1);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad a retirar");
                        cantidad = leer.nextDouble();
                        cajero.extraccionRapida(cantidad, cuenta1);
                        break;
                    case 4:
                        cajero.consultarSaldo(cuenta1);
                        break;
                    case 5:
                        cajero.consultarDatos(cuenta1);
                        break;
                    case 6:
                        ingreso = false;
                }    
            } else {
                System.out.println("Opción invalida. Vuelva a seleccionar");
            } 
        } while (ingreso == true);
        
    }
    
}
