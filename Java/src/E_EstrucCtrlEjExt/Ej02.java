package E_EstrucCtrlEjExt;

public class Ej02 {

    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        int A = 2, B = 4, C = 6, D = 8, X;
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D =" + D);
        X = B;
        B = C;
        C = A;
        A = D;
        D = X;
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D =" + D);
                
            
    }
    
}
