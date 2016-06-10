package lista3;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Entre com o valor de 'a' primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Entre com o valor de 'b' segundo número: ");
          int b = entrada.nextInt();

        System.out.print("Entre com o valor de 'c' terceiro número: ");
        int  c = entrada.nextInt();
        int maior = 0;
        int local1= 0;
        int local2 = 0;
        int menor = 0;
                

        if((a > b) && (a> c) ){

        maior = a;
        local1= b;
        local2= c;

        }if((b > c) && (b > a) ){ 

        maior = b;
        local1 = c;
        local2 = a;

        }else{

        maior = c;
        local1 = a;
        local2 = b;

        }



        if (local1 < local2){

        menor = local1;
        }else{

        menor = local2;
}
        System.out.println("O MAIOR número dos 3 digitados é " +maior); 
        System.out.println("o MENOR dos 3 digitados é " +menor);
}

}

    

