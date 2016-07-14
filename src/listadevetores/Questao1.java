package listadevetores;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeros[] = new int [5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("digite um numero "+ (i+1)+ ": ");
             numeros [i] = entrada.nextInt();
           }
        for (int numero : numeros){
            System.out.println("->" + numero);
        }
    }
}
