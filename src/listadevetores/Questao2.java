package listadevetores;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeros[] = new int [10];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero " +(i+1)+ ": ");
            numeros [i] = entrada.nextInt();
        }
        for (int i = (numeros.length - 1); i >= 0; i--){
            System.out.println("->" + numeros[i]);
        }
    }
}
