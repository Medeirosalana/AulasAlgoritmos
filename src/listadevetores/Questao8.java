package listadevetores;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nomes [] = new String [5];
        float alturas []  = new float [5] ;
        int idades []  = new int [5];
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome " + (i+1)+ ": ");
            nomes[i] = entrada.next();
            System.out.println("Digite a altura de " +nomes[i]+ ": ");
            alturas [i]  = entrada.nextFloat();
            System.out.println("Digite a Idade de "+ nomes[i] + ": ");
            idades [i]  = entrada.nextInt();
                
        }
        
        for (int i = (nomes.length - 1); i >= 0; i--){
            System.out.println("nomes -> " + nomes[i]);
            System.out.println("alturas -> "+ alturas [i]);
            System.out.println("Idades -> " + idades [i] );
        }
    }
}
