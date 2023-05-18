/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package E_EstrucCtrlEjExt;

public class EjExt12 {

    public static void main(String[] args) {
        int num = 0, dig1, dig2, dig3;
        String contadors, digs1, digs2, digs3;
        System.out.println("0-0-0");
        do{
            num++;
            dig1 = num % 10;
            if (dig1 == 3){
                digs1 = "E";
            } else {
                digs1 = String.valueOf(dig1);
            }
            dig2 = (num / 10) % 10;
            if (dig2 == 3){
                digs2 = "E";
            } else {
                digs2 = String.valueOf(dig2);
            }
            dig3 = (num / 100) % 10;
            if (dig3 == 3){
                digs3 = "E";
            } else {
                digs3 = String.valueOf(dig3);
            }
            System.out.println(digs3+"-"+digs2+"-"+digs1);
        } while (num < 999);
    }
    
}
