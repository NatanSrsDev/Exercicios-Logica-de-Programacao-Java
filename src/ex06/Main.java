package ex06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor e vou mostrar o reajuste: ");
        double valueUser = sc.nextDouble();

        double adjustmentValueUSer = (valueUser * 0.05) + valueUser;

        System.out.printf("O valor com reajuste ficou %.2f", adjustmentValueUSer);
    }
}
