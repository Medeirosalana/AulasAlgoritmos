package lista3;

import java.util.Scanner;


public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = entrada.next(); 
        if ( letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) 
        { System.out.println("Vogal");
        } 
        else System.out.println("consoante");
    }
    
}
