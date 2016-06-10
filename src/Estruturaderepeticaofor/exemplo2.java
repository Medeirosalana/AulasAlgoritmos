package Estruturaderepeticaofor;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero=0, soma=0;
        for (int i=1; i<=5; i++){
            System.out.print("Digite o número " + i + ": ");
            numero = entrada.nextInt();
            soma += numero;
        }
        System.out.println("soma " + soma);
    }
}
