package App;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class MainParDeNumeros {

    public static void main(String[] args) {
        
        ParDeNumerosService serv = new ParDeNumerosService();
        
        serv.mostrarValores();
        serv.devolverMayor();
        serv.calcularPotencia();
        serv.calcularRaiz();
        
    }
    
}
