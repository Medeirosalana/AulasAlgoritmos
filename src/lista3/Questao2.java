package lista3;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite um valor: ");
        float v= entrada.nextFloat();
        if ( 0 < v)
            System.out.println("o valor é positivo" );
        else if (0 > v)
            System.out.println("o valor é negativo" );
        else 
            System.out.println("o número é igual a 0");
    }
}
