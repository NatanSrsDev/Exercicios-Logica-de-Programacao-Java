package ex5;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
    //  5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //  usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu salario e vou calcular quantos salarios minimos voce ganha(Base para o Salário mínimo R$ 1.293,20): ");
        double userSalary = sc.nextDouble();

        double minimumSalary = 1293.20;

        double minimumWages = userSalary / minimumSalary;
        System.out.printf(
                "Seu salario de %.2f corresponde a %.2f sálarios minimos .%n",
                userSalary,
                minimumWages);
    }
}
