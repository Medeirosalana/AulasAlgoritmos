package introducao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Olá mundo!!!");
        System.out.println("Oi, novamente!!!");
        
        Scanner entrada = new Scanner (System.in);
        String nome;
        
         System.out.println("Qual o seu nome");
        
        nome = entrada.next();
        System.out.println("Bem vindo, " + nome );

       
    }
}
