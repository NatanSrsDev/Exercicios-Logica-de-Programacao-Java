package ex20;

import java.util.Scanner;

public class PrintTabuada2 {
    //20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro e retornarei a tabuada dele: ");
        int number = sc.nextInt();

        System.out.println("TABUADA DE "+ number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i +" = " + number * i);
        }
    }
}
