package ex21;

import java.util.Random;

public class SortNumber {
    // 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    public static void main(String[] args) {
        Random gerador = new Random();

        int number = gerador.nextInt(101);
        System.out.println(number);
    }
}
