package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int number = sc.nextInt();


        if ( number > 0 && number % 2 == 0){
            System.out.println("O numero é par e positivo, numero é " + number);
        }else if (number < 0 && number % 2 != 0){
            System.out.println("O numero é impar e negativo, numero é " + number);
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("O numero é impar e positivo, numero é " + number);
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("O numero é par e negativo, numero é " + number);
        }else {
            System.out.println("O numero não pode ser 0");
        }
    }
}
