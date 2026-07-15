package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int number = sc.nextInt();

        int antecessorNumber = number - 1;
        System.out.println("O antecessor de " + number+ " é: " + antecessorNumber);

        int sucessorNumber = number + 1;
        System.out.println("O sucessor de " +number+ " é: " + sucessorNumber);
    }
}
