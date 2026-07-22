package ex08;

import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor: ");
        int value1 = sc.nextInt();


        System.out.println("Entre com o segundo valor: ");
        int value2 = sc.nextInt();

        System.out.println("Entre com o terceiro valor: ");
        int value3 = sc.nextInt();

        List<Integer> values = new ArrayList<>();
        values.add(value1);
        values.add(value2);
        values.add(value3);

        values.sort(Collections.reverseOrder());
        System.out.println(values);
    }
}
