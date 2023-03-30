package E_EstrucCtrlEjExt;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        /*Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
*/
        Scanner leer = new Scanner(System.in);
        int cantpers, cantbaja = 0, cantalta = 0;
        double altura, sumaltura = 0, sumabaja = 0, sumaalta = 0;
        System.out.println("La cantidad de personas");
        cantpers = leer.nextInt();
        for (int i = 1; i <=cantpers ; i++){
            System.out.println("Ingrese la altura de la persona " + i + " en metros");
            altura = leer.nextDouble();
            sumaltura += altura;
            if (altura < 1.60){
                cantbaja++;
                sumabaja += altura;
            } else {
                cantalta++;
                sumaalta += altura;
            }
        }
        System.out.println("El promedio de la altura por debajo de 1,60 mts es de " + sumabaja / cantbaja);
        System.out.println("El promedio de la altura por arriba de 1,60 mts es de " + sumaalta / cantalta);
        System.out.println("El promedio de la altura de todas las personas es de " + sumaltura / cantpers);
    }
    
}
