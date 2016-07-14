package Estruturaderepetiçãowhile;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a=0, b=0, c=0, x=0, y=0, v=0 ;
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
        
        float t =  a+b+c;
     
        if ((a / (a+b+c)> 0.5f) || (b/(a+b+c) > 0.5f) || (c/(a+b+c)>0.5f)){
            System.out.println("Eleição em 1 turno");
        
        
        if(a> b && a>c){
            System.out.println("vencedor é o canditado 3");
        }
        
        else if (b > a && b > c  ){
            System.out.println("o vencedor é canditado 2");
        }
        
        
        else if (c > a && c > b && c > 50 ){
            System.out.println("o Vencedor é canditado 3");
        
        }
        }
        else {
            System.out.println("Vai para segundo tuno");
        }
        
        
        
        
    }
    
 } 
 	
                
    

