package ex11;

import java.util.Locale;
import java.util.Scanner;

public class AlunoAv {
    public static void main(String[] args) {

        //  11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
        // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Insira a quarta nota: ");
        double nota4 = sc.nextDouble();


        double calculatorAverage = (nota1 + nota2 + nota3 + nota4) / 4;


        if (calculatorAverage >= 7){
            System.out.println("O aluno "+ nome + " esta aprovado");
            System.out.printf("Sua media é: %.1f", calculatorAverage);
        }else {
            System.out.println("O aluno "+ nome +" esta reprovado");
            System.out.printf("Sua media é: %.1f", calculatorAverage);
        }
    }
}
