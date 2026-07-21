package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DataCalculator {
    //15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
    //consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida)
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira sua data de nascimento: ");
            String entradaData = sc.next();


            LocalDate dataHoje = LocalDate.now();
            DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate dataNascimento = LocalDate.parse(entradaData, formatoBr);

            // utilizando a API para pegar a quantidade totais de dias entre os intervalos de tempo
            long totalDias = ChronoUnit.DAYS.between(dataNascimento, dataHoje);

            // aplicando a regra de tempo imposta no enunciado
            long ano = totalDias / 365;
            long restoOfAno = totalDias % 365;
            long mes = restoOfAno / 30;
            long restoOfMes = restoOfAno % 30;
            long dias = restoOfMes;


            System.out.println("Você tem "+ano+ " anos, "+mes+" meses, "+dias+" dias de vida");
    }
}