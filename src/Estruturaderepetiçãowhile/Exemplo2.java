package Estruturaderepetiçãowhile;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
         int numero = 0,soma = 0 ,contador = 0;
         do {
             System.out.println("Digite um numero: ");
             numero = entrada.nextInt();
             soma += numero;
             contador++;
         }
         while ( numero != 0 );
        float media = soma / contador - 1;
        System.out.println("soma: " + soma + "  Média: " + media);
                            
       
        
        
        
        
        
    }
}