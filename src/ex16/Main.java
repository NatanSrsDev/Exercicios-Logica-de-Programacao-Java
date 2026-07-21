package ex16;

import java.util.Scanner;
public class Main {
    //16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voce vai escolher os tamanhos para os lados de um triangulo ");
        System.out.println("Insira o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Insira o valor de C:");
        int c = sc.nextInt();

        Triangulo triangulo1 = new Triangulo(a,b,c);

        if (triangulo1.ehValido()) {
            System.out.println(triangulo1.tipoTriangulo());
        }
    }
}
