package Teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AgregarObjetos {

    public static void main(String[] args) {
        // Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        for (int i = 0; i < 5; i++) {
            numerosA.add(i*5);
        }
        System.out.println(numerosA);
        numerosA.remove(1);//por indice
        numerosA.remove(Integer.valueOf(20));//por elemento
        numerosA.remove(Integer.valueOf(20));//por elemento
        System.out.println(numerosA);
        
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        for (int i = 0; i < 5; i++) {
            numerosB.add(i*5);
        }
        System.out.println(numerosB);
        numerosB.remove(20);
        System.out.println(numerosB);
        
        HashMap<Integer,String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        for (int i = 0; i < 5; i++) {
            alumnos.put(i,"Tito");
        }
        System.out.println(alumnos);
        alumnos.remove(3);
        System.out.println(alumnos);
    }
    
}
