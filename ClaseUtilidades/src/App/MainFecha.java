package App;

import Servicios.FechaService;
import java.time.LocalDate;
import java.util.Date;

public class MainFecha {

    public static void main(String[] args) {
        
        FechaService serv = new FechaService();
        
        Date fechaNac = serv.fechaNacimiento();
        System.out.println("La fecha de Nacimiento es " + fechaNac);
        
        Date fechaHoy = serv.fechaActual();
        System.out.println("La fecha Actual es " + fechaHoy);
        
        serv.diferencia(fechaNac, fechaHoy);
    }
    
}
