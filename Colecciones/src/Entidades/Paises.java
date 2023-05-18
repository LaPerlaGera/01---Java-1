package Entidades;

import java.util.HashSet;

public class Paises {
    
    private HashSet<String> paises;

    public Paises() {
        paises = new HashSet();
    }

    public HashSet<String> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<String> paises) {
        this.paises = paises;
    }
    
    public void agregarPais(String pais){
        paises.add(pais);
    }

    @Override
    public String toString() {
        return "La lista de Paises es :\n" 
                + paises;
    }
    
    
}
