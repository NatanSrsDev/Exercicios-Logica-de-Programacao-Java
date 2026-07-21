package ex14;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor para A: ");
        double A = sc.nextDouble();

        System.out.println("Insira o segundo valor para B: ");
        double B = sc.nextDouble();


        double valor1 = B;
        double valor2 = A;
        System.out.println("O valor A agora é: "+valor1);
        System.out.println("O valor B agora é: "+valor2);
    }


}
