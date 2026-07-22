package ex17;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    //17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.   // Fórmula: C = (5 * ( F-32) / 9)
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = sc.nextDouble();

        // formula de conversão para celsius
        double tempC = (5 *(tempF - 32) / 9);

        System.out.println("Temperatura em Fahrenheit: " + tempF);
        System.out.println("------- Conversão sendo feita(...) ---------------");
        System.out.println("Temperatura em graus Celsius: " + tempC);
    }
}
