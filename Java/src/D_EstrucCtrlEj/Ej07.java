package D_EstrucCtrlEj;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().*/
        Scanner leer = new Scanner(System.in);
        String cadena;
        String FDE = "&&&&&";
        int correctas = 0, incorrectas = 0;
        do{
            System.out.println("Ingrese un texto de 5 caracteres que comience con X y termine con O");
            cadena = leer.nextLine();
            if (cadena.equals(FDE)){
                break;
            } else if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
                System.out.println("Formato correcto");
                correctas++;
            }else {
                System.out.println("Formato incorrecto");
                incorrectas++;
            }
        }
        while (cadena != FDE);
        System.out.println("Cantidad de lecturas correctas: " + correctas);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectas);
    }
}