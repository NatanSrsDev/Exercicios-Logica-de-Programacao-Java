package ex12;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
    // 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
    // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Qual a forma de pagamento (digite o numero correspondente): ");
        System.out.println("Dinheiro(1), PIX(2), Credito a vista(3), Credito Parcelado(4)");
        int tipoPagamentoInt = sc.nextInt();

        if (tipoPagamentoInt == 4){
            System.out.println("Quantas parcelas? (max. 10x)  ");
            int creditoParcelas = sc.nextInt();
            if (creditoParcelas == 2){
                tipoPagamentoInt = 4;
            } else if (creditoParcelas >= 3) {
                tipoPagamentoInt = 5;
            }
            else {
                // teria que lancar uma exceção caso fosse maior que 10x, e aceitar se fosse 1x
                tipoPagamentoInt = 3;
            }
        }

        TipoPagamento tipoPagamento = TipoPagamento.procurarCodPagamento(tipoPagamentoInt);
        tipoPagamento.calcularDesconto(valorProduto);

    }

}
