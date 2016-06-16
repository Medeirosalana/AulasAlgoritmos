package Estruturaderepetiçãowhile;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a=0, b=0, c=0, x=0, y=0 , v=0;
        String sair = "nao";
        do{ 
            System.out.println("votação\n"
                    + "1 - canditado 1\n"
                    + "2 - canditado 2\n"
                    + "3 - candidato 3\n"
                    + "0 branco\n"
                    + "voto: ");
                v = entrada.nextInt();
            switch (v){
            case 1:
            a++;
            break;
            case 2:
                b++;
                break;
            case 3:
                c++;
                break;
            case 0:
                x++;
                break;
            default:
                y++;
            }
             System.out.println("sair? ");
             sair = entrada.next();
        
        } while (!sair.equalsIgnoreCase("sim"));
        System.out.println("resultado \n"
                    + a + " - canditado 1\n"
                    + b +" - canditado 2\n"
                    + c +" - candidato 3\n"
                    + x +" branco\n"
                    + y +" nulo ");
        if ( a > b && a > c){
            System.out.println("o vencedor é candidato 1");
        
        }
        else if (b > a && b > c){
            System.out.println("o vencedor é canditado 2");
        }
        else {
            System.out.println("o Vencedor é canditado 3");
        
        }
        int t= 0;
        t = a + b + c;
        int pa;
        pa = (a / t) / 100;
        System.out.println("Porcentagem do candidato 1" + pa + "%");
      
        
    }
    
 } 
 	
                
    

