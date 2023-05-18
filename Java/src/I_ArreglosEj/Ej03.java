/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package I_ArreglosEj;

public class Ej03 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        int dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, dig5 = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()* 100000);
            String num = String.valueOf(vector[i]);
            switch (num.length()){
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;    
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;    
            }
            }
        System.out.println(dig1+" números tienen 1 dígito");
        System.out.println(dig2+" números tienen 2 dígitos");
        System.out.println(dig3+" números tienen 3 dígitos");
        System.out.println(dig4+" números tienen 4 dígitos");
        System.out.println(dig5+" números tienen 5 dígitos");
        }
}
