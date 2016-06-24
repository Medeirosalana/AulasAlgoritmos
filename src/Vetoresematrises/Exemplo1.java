package Vetoresematrises;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int numero[] = new int [10];
        String nome[] = new String[10];
        for (int i = 0; i < numero.length; i++){
            System.out.print("Digite um  número " +(i+1)+ ": ");
            numero[i] = entrada.nextInt();
        }
        for (int j = (numero.length - 1); j >= 0; j--){
            System.out.println("->" + numero[j]);
        }
    }
}
