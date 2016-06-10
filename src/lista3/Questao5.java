package lista3;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite a média 1: ");
        float m1= entrada.nextFloat();
        System.out.println("Digite a média 2: ");
        float m2= entrada.nextFloat();
        float m3= m1 + m2 / 2;
        if (m3 >= 7) {
        
            System.out.println("Aprovado ");}
        else if (m3 < 7) {System.out.println("Reprovado"); }
        else if (m3 == 10) { 
            System.out.println("Aprovado com Distinção");}
        
    }
}
