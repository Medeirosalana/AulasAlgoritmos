package lista4;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite 0 lado do triangulo 1: ");
        float lado1 = entrada.nextFloat();
        System.out.println("Digite o lado do triangulo 2:");
        float lado2 = entrada.nextFloat();
        System.out.println("Digite o lado do triangulo 3:");
        float lado3 = entrada.nextFloat();
           if ((lado1 < (lado2 + lado3)) 
                   && (lado2 < (lado1 + lado3)) 
                   && (lado3 < (lado1 + lado2))) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("Triangulo Equilatero");
                } else if ((lado1 == lado2) || (lado1 == lado3)) {
                    System.out.println("Triangulo Isosceles");
                } else
                    System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Não é um triangulo!");
            }
}
}
