package listaderepetiçao;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = entrada.next();
        System.out.println("Digite sua senha: ");
        String senha = entrada.next();
        while ( nome.equalsIgnoreCase(senha)){
            System.out.println("erro nome não pode ser igual ao nome");
        break;
        }
    }
}
