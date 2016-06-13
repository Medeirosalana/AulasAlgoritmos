package lista4;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite a nota 2: ");
        float n2 = entrada.nextFloat();
        System.out.println("Digite a nota 3: ");
        float n3 = entrada.nextFloat();
        float m = (n1 + n2 + n3 ) / 3;
        System.out.println("A media é: " + m);
        if ( m == 10){
            System.out.println("aprovado com distinção");
            
        }
        else if (m >= 7){
            System.out.println("aprovado");                
        }
        else {
            System.out.println("reprovado");
        }
           
                
                }
}
