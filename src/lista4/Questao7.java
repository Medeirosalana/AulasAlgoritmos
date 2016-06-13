package lista4;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("informe o ano: ");
        int ano= entrada.nextInt();
         int x = ano;
        if (ano % 100 == 0 ){
            x = ano / 100;
                              
        }
        if (x % 4  == 0 ){
        
        
        System.out.println(+ ano+ " :é um ano bisexto");}
        else{
            System.out.println(ano + " : não é um ano bisexto");}
        
            
    }
}
