package lista4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite a nota 2: ");
        float n2 = entrada.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("A média das notas é: " + m);
        if (m == 10.0f && m > 9.0f){
            System.out.println("Conceito a");
            System.out.println("Aprovado");
        }
        else if (m >= 7.5f && m < 9.0f ) {
            System.out.println("Conceito b");
            System.out.println("Aprovado");
            
    }
        else if ( m >= 6.0f && m < 7.5f ){
            System.out.println("Conceito c");
            System.out.println("Aprovado");
                 
            }
        else if ( m >= 4.0f && m < 6.0f ) {
            System.out.println("Conceito d");
            System.out.println("Reprovado");
                   
        }
        else if ( m == 0 && m > 4.0f) {
            System.out.println("Conceito e");
            System.out.println("Reprovado");
        }
    }
}
