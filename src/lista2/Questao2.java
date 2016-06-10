package lista2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a sua altura?");
        float a  = entrada.nextFloat();
        float r = (float) ((72.7 * a)-58);
        System.out.println("Seu peso é: " + r);
    }
    
}
