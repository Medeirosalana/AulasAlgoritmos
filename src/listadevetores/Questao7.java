package listadevetores;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeros [] = new int [5];
        int soma = 0;
        int multiplicacao = 1;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("digite o numero " +(i+1)+ ": ");
            numeros[i] = entrada.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }
        for (float numero : numeros){
            System.out.println("numero: " + numero );
       
        }
        System.out.println("multiplicação: " + multiplicacao);
        System.out.println("soma: " + soma);
    }
}
