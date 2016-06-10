
package introducao;

import java.util.Scanner;


public class exemplo3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println("Digite um numero");
        int inteiro = entrada.nextInt();
        
        System.out.println("Digite outro numero");
        int numero = entrada.nextInt();
      
        System.out.println("a soma é:");
        System.out.println (inteiro + numero );
        
       
    }
}
