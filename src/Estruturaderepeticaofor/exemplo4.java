package Estruturaderepeticaofor;

import java.util.Scanner;


public class exemplo4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Qual número quer a tabuada? ");
        int tabuada= entrada.nextInt();
         for(int i=0; i<=10; i++ ){
             System.out.println(tabuada + " x " + i +" = "+ (tabuada * i ) );
         }
    }
}
