package Estruturaderepetiçãowhile;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = entrada.nextInt();
        int elemesmo = 0;
        int resto = 0;
        int contador= 0;
//        while (n >= elemesmo ){
//        elemesmo++;
//        resto = n % elemesmo;
//        if (resto == 0){
//        contador++;
//        }        
//        }
        for (int i = 1; i <=n; i++ ){
        if (n % i == 0){
        contador++;
        }
        
        }
        
        if (contador == 2 ){
            System.out.println("O número : " + n + " é primo");
        }
        else{
            System.out.println("o número: " + n + " não é primo");
        }
        
    }
}
