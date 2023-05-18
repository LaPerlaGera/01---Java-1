package Servicio;

import Entidad.Ej01CuentaBancaria;
import java.util.Scanner;

public class Ej01CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Ej01CuentaBancaria crearCuenta(){
        Ej01CuentaBancaria cuenta = new Ej01CuentaBancaria();
        System.out.println("Ingrese su numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su numero de DNI");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo actual");
        cuenta.setSaldoActual(leer.nextDouble());
        return cuenta;
    }
    
    public void ingresar(double cantidad, Ej01CuentaBancaria cuenta){
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se ha ingresado " + cantidad + " a la cuenta.");
    }
    
    public void retirar(double cantidad, Ej01CuentaBancaria cuenta){
        if ((cuenta.getSaldoActual() - cantidad) < 0) {
            double saldo = cuenta.getSaldoActual();
            cuenta.setSaldoActual(0);
            System.out.println("No se puede retirar la cantidad solicitada. Se han retirado " + saldo + " de la cuenta.");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            System.out.println("Se han retirado " + cantidad + " de la cuenta.");
        }
    }
    
    public void extraccionRapida(double cantidad, Ej01CuentaBancaria cuenta){
        if ((cuenta.getSaldoActual() * 0.20) >= cantidad){
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            System.out.println("Se han retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("No se puede retirar más del 20% del saldo de la cuenta.");
        }
    }
    
    public void consultarSaldo(Ej01CuentaBancaria cuenta){
        System.out.println("El saldo de la cuenta es " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Ej01CuentaBancaria cuenta){
        System.out.println(cuenta.toString());
    }
}
