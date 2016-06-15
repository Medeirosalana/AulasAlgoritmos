package Estruturaderepetiçãowhile;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String resposta = "nao";
        int tentativas = 0;
        while (!resposta.equalsIgnoreCase("sim")){
            System.out.print("Eu sou bonito? ");
            resposta = entrada.next();
           tentativas = tentativas + 1;
        
           
        }
        System.out.println("parabens você acerto em: " + tentativas + " tentativas" );
    }
}
