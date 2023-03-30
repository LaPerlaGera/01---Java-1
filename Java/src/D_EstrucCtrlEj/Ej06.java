package D_EstrucCtrlEj;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.*/
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmacion;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        do {
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0){
                        System.out.println("Error. No se puede dividr por cero.");    
                    }else{
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)?");
                    confirmacion = leer.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's'){
                        System.out.println("Saliendo del programa....");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese una opción del 1 al 5");
                    break;
                    
            }
        }while (true);
    }
    
}
