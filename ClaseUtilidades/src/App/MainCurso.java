package App;

import Entidades.Curso;
import Servicios.CursoService;

public class MainCurso {

    public static void main(String[] args) {
        
        CursoService serv = new CursoService();
        
        Curso curso1 = serv.crearCurso();
        
        System.out.println(curso1.toString());
        
        System.out.println("La ganancia por semana es: " + serv.calcularGananciaSemana(curso1));
        
    }
    
}
