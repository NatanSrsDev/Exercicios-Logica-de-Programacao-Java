package ex7;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor Booleano(TRUE or FALSE): ");
        boolean value1 = sc.nextBoolean();
        System.out.println("Insira o segundo valor: ");
        boolean value2 = sc.nextBoolean();

        if (value1 && value2 ){
            System.out.println("Ambos são verdadeiros");
        } else if (!value1  && !value2) {
            System.out.println("Ambos são falsos");
        } else if (value1 &&  !value2) {
            System.out.println("Primeiro valor é verdadeiro e o segundo é Falso");
        } else {
            System.out.println("O primeiro valor é falso e o segundo é verdadeiro");
        }
    }
}
