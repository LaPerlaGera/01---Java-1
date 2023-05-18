package Main;

import Entidad.IntroObjPersona;

public class IntroObjMenu {

    public static void main(String[] args) {
        
        IntroObjPersona pers1 = new IntroObjPersona();
        IntroObjPersona pers2 = new IntroObjPersona("Gerardo", 41, 69);
        
        // pers2.edad = 20; //cambiamos el valor ingresado, esto se puede hacer si está en publico el atributo
        pers2.setNombre("Fabián");//creamos un metodo set en la clase del objeto, para acceder al atributo
        
        System.out.println(pers1); //posición en la memoria del objeto
        System.out.println(pers2); //posición en la memoria del objeto
        
        //System.out.println(pers1.nombre+" "+pers1.edad+" "+pers1.peso); // se muestra así si el atributo es público
        //System.out.println(pers2.nombre+" "+pers2.edad+" "+pers2.peso);
        
        System.out.println(pers2.getNombre());//para mostrar un atributo privado, se configura el metodo get
    }
    
}
