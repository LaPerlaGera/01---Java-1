package App;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;

public class MainAhorcado {

    public static void main(String[] args) {
        
        AhorcadoService servAhorcado = new AhorcadoService();
        
        servAhorcado.juego();
        
    }
    
}
