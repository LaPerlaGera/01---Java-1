package Servicios;

import Entidades.Inventario;
import java.util.Map;

public class InventarioServicio {
    
    Inventario inventario = new Inventario();
    
    public void agregarProducto(String nombre, Double precio){
        inventario.getInventario().put(nombre, precio);
    }
    
    public void modificarPrecio(String nombre, Double precio){
        if (inventario.getInventario().containsKey(nombre)){
            inventario.getInventario().put(nombre, precio);
        } else {
            System.out.println("El producto no existe en el inventario");
        }
    }
    
    public void eliminarProducto(String nombre){
        if (inventario.getInventario().containsKey(nombre)){
            inventario.getInventario().remove(nombre);
        } else {
            System.out.println("El producto no existe en el inventario");
        }
    }
    
    public void mostrarInvenario(){
        System.out.println("Inventario:");
        for (Map.Entry<String,Double> producto : inventario.getInventario().entrySet()) {
            System.out.println("Nombre: " + producto.getKey() + " - Precio: " + producto.getValue());
        }
    }
    
}
