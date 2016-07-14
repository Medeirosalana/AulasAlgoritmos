
package listadevetores;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeros [] = new int [20];
        int impares=0;
        int pares = 0;
        for (int i = 0; i < numeros.length; i++ ){
            System.out.println("digite o numero " +(i+1)+ ": ");
            numeros[i] = entrada.nextInt();
        
        }
        for (int numero : numeros){
         if (numero % 2 == 0) {
             pares++;
         }
         else{
         impares++;
         }
            
       }
        
        System.out.println("qtd pares: " + pares);
        System.out.println("qtd impares: " + impares);
    }
}
