package listaderepetiçao;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Seu nome: ");
        String nome = entrada.next();
        System.out.println("sua idade: ");
        int idade = entrada.nextInt();
        while (idade > 150 ){
            System.out.println("idade invalida");
            break;
        }
        System.out.println("seu sexo m ou f");
        String sexo = entrada.next();
        
        
    }
}
