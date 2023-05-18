package Entidades;

import java.util.HashMap;

public class Inventario {
    
    private HashMap<String,Double> inventario;

    public Inventario() {
        inventario = new HashMap();
    }

    public HashMap<String, Double> getInventario() {
        return inventario;
    }

    public void setInventario(HashMap<String, Double> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Inventario{" + "inventario=" + inventario + '}';
    }
    
    
}
