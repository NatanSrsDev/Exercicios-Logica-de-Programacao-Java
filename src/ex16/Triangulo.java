package ex16;

import java.util.Scanner;

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public boolean ehValido(){
        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoC) && (ladoB + ladoC > ladoA)){
            System.out.println("Este triangulo tem os valores validos");
            return true;
        }
        System.out.println("Este triangulo tem os valores invalidos");
        return false;
    }
    
    public String tipoTriangulo(){
        if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
            // 1 - Equilatero = tem todos os 3 lados iguais
            return "Este é um triangulo equilátero, pois tem todos os 3 lados iguais";
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            // 2 - Isósceles = tem 2 lados iguais e um diferente
            return "Este é um triangulo isósceles, pois tem 2 lados iguais e um diferente";
        } else {
            // 3 - Escaleno = todos os lados diferentes
           return "Este é um triangulo escaleno, pois todos os lados diferentes";
        }
    }
}
