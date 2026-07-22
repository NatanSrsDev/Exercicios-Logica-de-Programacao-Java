package ex19;

public class printTabuada {
    // 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("TABUADA DE " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " +  j + " = " + i * j);
            }
        }
    }
}
