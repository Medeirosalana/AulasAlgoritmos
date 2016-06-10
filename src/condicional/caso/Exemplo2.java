package condicional.caso;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("# OPÇÕES # /nGabriel/nCarlos/nCaio");
        String escolha = entrada.next();
        switch (escolha) {
            case "Gabriel":
                System.out.println("Cabra bom esse garoto");
                break;
            case "Carlos":
                System.out.println("Sujeito serio e concentrado");
                break;
            case "Caio":
                System.out.println("Gente fina e honesta");
                break;
            default:
                System.out.println("Você é azedo e não gosta de gente");
        }
        
    }
    
}
