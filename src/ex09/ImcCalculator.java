package ex09;

import java.util.Locale;
import java.util.Scanner;

public class ImcCalculator {
    public static void main(String[] args) {
        //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tel sua condição
        //de acordo com a tabela abaixo:
        //Fórmula do IMC = peso / (altura) ²

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Insira sua altura(ex.: 1.70): ");
        double altura = sc.nextDouble();


        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("Seu IMC é %.2f - Abaixo do peso.%n", imc);
        } else if (imc <= 24.9) {
            System.out.printf("Seu IMC é %.2f - Peso ideal (parabéns!).%n", imc);
        } else if (imc <= 29.9) {
            System.out.printf("Seu IMC é %.2f - Levemente acima do peso.%n", imc);
        } else if (imc <= 34.9) {
            System.out.printf("Seu IMC é %.2f - Obesidade Grau I.%n", imc);
        } else if (imc <= 39.9) {
            System.out.printf("Seu IMC é %.2f - Obesidade Grau II (Severa).%n", imc);
        } else {
            System.out.printf("Seu IMC é %.2f - Obesidade Grau III (Mórbida).%n", imc);
        }
    }
}
