package C_EstrucCtrlTeoria;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        /*Considera que estás desarrollando una web para una empresa que fabrica
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”*/
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione el tipo de motor para mover fluidos");
        System.out.println("Ingrese 1 - motor para bomba de agua");
        System.out.println("Ingrese 2 - motor para bomba de gasolina");
        System.out.println("Ingrese 3 - motor para bomba de hormigón");
        System.out.println("Ingrese 4 - motor para bomba de pasta alimenticia");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
