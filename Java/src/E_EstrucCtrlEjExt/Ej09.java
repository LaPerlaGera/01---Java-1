/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, resto=0, cociente=0;
        
        do {
        System.out.println("Ingrese un número entero mayor a 1 - dividendo");
        dividendo = leer.nextInt();
        } while (dividendo < 2);
        
        do {
        System.out.println("Ingrese otro número entero mayor a 1 - divisor");
        divisor = leer.nextInt();
        } while (divisor < 2);   
        
        if (dividendo < divisor ){
            System.out.println("El dividendo es menor al divisor");
        } else {
                while (dividendo > divisor){
                    resto = dividendo - divisor;
                    dividendo = resto;
                    cociente++;
                }
            System.out.println("El cociente de la división es "+ cociente + " y el residuo es " + resto);
        }    
    }
}