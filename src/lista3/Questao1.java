
package lista3;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite um número? ");
        int n1= entrada.nextInt();
        System.out.println("Digite outro número? ");
        int n2= entrada.nextInt();
        if (n1>n2)
            System.out.println("o maior é: " + n1);
        else System.out.println("o numero maior é: " + n2);
              
            
        
        
          
    }
    
}
