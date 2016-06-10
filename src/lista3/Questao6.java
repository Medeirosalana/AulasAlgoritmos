package lista3;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Digite o  numero 1: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o numero 2: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite o numero 3: ");
        int n3 = entrada.nextInt();
        if (n1 > n2){System.out.println("o maior é:"+ n1 ) ; }
        else if(n1 > n3 ) { System.out.println("o maior é:"+ n1 );}
        else if (n2 > n3) {System.out.println("o maior é: "+ n2 ); }
        else if (n2 > n1){ System.out.println("o maior é: " + n2);}
        else if (n3>n1){ System.out.println("o maior é:" + n3 );}
        else if (n3>n2){System.out.println("o maior é: " + n3);}
    }
            
}
