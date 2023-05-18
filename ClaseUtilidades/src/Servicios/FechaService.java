package Servicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el día de su Nacimiento (formato dd)");
        int d = leer.nextInt();
        System.out.println("Ingrese el mes de su Nacimiento (formato mm)");
        int m = leer.nextInt();
        System.out.println("Ingrese el año de su Nacimiento (formato yy)");
        int a = leer.nextInt();
        Date fecha = new Date(a,m-1,d);
        return fecha;
    }
        
    public Date fechaActual(){
        Date hoy = new Date();
        return hoy;
    }
    
    public void diferencia(Date nac, Date actual){
        long difEnMiliseg = actual.getTime() - nac.getTime();
        long milisegPorAños = 1000L * 60 * 60 * 24 * 365; //asumimos un año de 365 días
        int difAños = (int) (difEnMiliseg / milisegPorAños);
        System.out.println("La diferencia en años que hay entre la fecha de Nacimiento y la acutal es " + difAños);
    }
    
    // esta es la forma mas actual con LocalDate no Date que está obsoleta no se exacto par algunos calculos
    public void diferencia2(LocalDate nac, LocalDate actual){
        Period rango = Period.between(nac, actual);
        System.out.println("La diferencia en años que hay entre la fecha de Nacimiento y la acutal es " + rango.getYears());
    }
    
}
