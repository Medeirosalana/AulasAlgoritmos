package Vetoresematrises;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nomes[]= new String[2];
        int notas [][] = new int [2][3];
        
        
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Nome " +(i+1)+ ": ");
            nomes[i] = entrada.next();
            for (int j = 0; j < 3; j++){
                System.out.println("nota " + (j + i)+ "de "+ nomes[i]+ ": ");
                notas[i][j] = entrada.nextInt();
                
            }
        }
            
          for (String nome : nomes){
              int soma = 0;
          for(int[] nota_nome : notas){
            for (int nota : nota_nome){
            soma += nota;
          }
          }
          }
    
    }
}
         
          
          
               
        
        
    
