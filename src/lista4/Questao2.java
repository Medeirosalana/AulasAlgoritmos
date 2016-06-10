package lista4;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Qual o valor da hora de trabalho? ");
        float tr = entrada.nextFloat();
        System.out.println("Quantas horas trabalhou no mês? ");
        int h = entrada.nextInt();
        float sa = tr * h;
        System.out.println("Seu salario bruto é R$: " + sa);
        float fgts = (sa * 0.11f);
        System.out.println("o FGTS é R$: " + fgts);
        float inss = (sa * 0.10f);
        System.out.println("o INSS é R$: " + inss);
        float ir = 0;
        if ( sa <= 900f ) {
            
        }
        else if ( sa > 900f && sa <= 1500 ){
        ir = sa * 0.05f ;
        }
        else if ( sa > 1500 && sa <= 2500){
        ir = sa * 0.10f;
        }
        else if ( sa > 2500){
        ir = sa * 0.20f;
        }
        System.out.println("Seu imposto de renda R$: " + ir);
        System.out.println("Total de descontos R$: " + (ir + inss));
        System.out.println("Salario liquido R$: " + (sa - (ir+ inss)) );
            
            
              
    }
}
