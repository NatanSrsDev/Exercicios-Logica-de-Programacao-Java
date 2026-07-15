package ex10;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorAv {
    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();


        double calculatorAverage = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua media é: %.1f", calculatorAverage);
    }
}
