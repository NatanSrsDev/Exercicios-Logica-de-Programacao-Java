package ex18;

import java.util.Locale;

public class Main {
    // 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;

        int anoContagem = 0;
        while (alturaSara < alturaFrancisco){
            alturaFrancisco += 0.2;
            alturaSara += 0.3;
            anoContagem ++;
        }

        System.out.println("Em " +anoContagem+ " anos Sara sera maior que Francisco");

    }
}
