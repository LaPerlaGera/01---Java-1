package App;

import Servicios.InventarioServicio;
import java.util.Scanner;

public class Ej06Inventario {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        InventarioServicio serv = new InventarioServicio();
        
        int opcion;
        do{
            System.out.println("****MENU****");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            
            System.out.println("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el precio del prodcuto");
                    double precio = leer.nextDouble();
                    
                    serv.agregarProducto(nombre, precio);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto");
                    nombre = leer.nextLine();
                    System.out.println("Ingrese el nuevo precio del prodcuto");
                    precio = leer.nextDouble();
                    serv.modificarPrecio(nombre, precio);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a eliminar");
                    nombre = leer.nextLine();
                    serv.eliminarProducto(nombre);
                    break;
                case 4:
                    serv.mostrarInvenario();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion !=5);
        
        
    }
    
}
