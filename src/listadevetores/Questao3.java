package listadevetores;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       float notas[] = new float[4];
        float media = 0;
        
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("nota "+ (i+1)+ ": ");
            notas[i] = entrada.nextInt();
        media += notas[i] / 4;
        }
        for (float nota : notas){
            System.out.println("sua media é: " + media);
        
                
                
        
        
        }
        }
                

    }

