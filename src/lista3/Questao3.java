package lista3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Qual seu sexo? ");
        String sexo = entrada.next();
        if 
       (sexo.equalsIgnoreCase("m")|| sexo.equalsIgnoreCase("masculino")) {
            System.out.println("Masculino");
        }
        else if 
        (sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("feminino"))
        { System.out.println("Feminino");
        
        }
        else
            System.out.println("Sexo invalido");
    
                
        
    }
}
