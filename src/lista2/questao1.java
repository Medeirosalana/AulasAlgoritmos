package lista2;

import java.util.Scanner;


public class questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o número 2: ");
        int n2 = entrada.nextInt();           
        System.out.print("Digite o número 3: ");
        float n3 = entrada.nextFloat();
        int a = n1 * 2 * n2 / 2;
        System.out.println("Resultado A é: "+ a );
        int b = n1 * 3 + n2;
        System.out.println("Resultado B é: " + b);
        float c = n3 * n3 * n3;
        System.out.println("Resultado C é: " +c);
       
    }
}
