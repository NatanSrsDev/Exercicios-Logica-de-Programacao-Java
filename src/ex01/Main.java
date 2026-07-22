package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor para A");
        double a = sc.nextDouble();

        System.out.println("Entre com um valor para B");
        double b = sc.nextDouble();

        System.out.println("Entre com um valor para C");
        double c = sc.nextDouble();


        double soma = a + b;
        System.out.println("A soma entre A & B é: " + soma);
        if (soma < c){
            System.out.println("O resultado é menor que C");
        } else {
            System.out.println("O resultado não é menor que C");
        }

    }
}
