/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroObjClases;

/**
 *
 * @author Gerardo
 */
public class IntroObjPersona {
    
    private String nombre;
    private int edad;
    private double peso;
    
    public IntroObjPersona(){
        
    }
    
    public IntroObjPersona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public void setNombre(String nombre){//metodo para poder acceder al atributo privado
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getNombre(){
        return nombre;
    }
}
