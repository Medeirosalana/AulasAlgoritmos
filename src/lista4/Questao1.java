package lista4;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Qual o salario? ");
        float sa= entrada.nextFloat();
        System.out.println("Seu salario é: " +sa );
        float a = 0,b=0,c=0,d=0;
        if (sa <= 280f){
           a = (sa * 0.20f) ;
         System.out.println("seu reajuste é: 20%");
            System.out.println("seu aumento é R$: "+ a);
            System.out.println("Seu salario atual é R$: " +(sa + a ) );
        }
        else if (sa > 280f && sa<= 700f ){
            b = (sa * 0.15f );
            System.out.println("seu reajuste é: 15%");
            System.out.println("seu aumento é R$: " + b );
            System.out.println("Seu salario atual é R$: " +(sa + b ) );
        
        }
        else if (sa > 700f && sa <= 1500f){
            c = sa * 0.10f;
        System.out.println("seu reajuste é: 10%");
        System.out.println("seu aumento é R$: " + c);
        System.out.println("Seu salario atual é R$: " +(sa + c ) );
        }
        else if (sa > 1500f ){
            d = sa * 0.05f;
        System.out.println("seu reajuste é: 5%");
        System.out.println("seu aumento é R$: " + d);
        System.out.println("Seu salario atual é R$: " +(sa + d ) );
        }
    
    
        
        
    }
            
}
