package ex12;


import java.util.Scanner;

public enum TipoPagamento {
    DINHEIRO(1){
        @Override
        public void calcularDesconto(double valorProduto) {
            double valorProdutoFinal = valorProduto - (valorProduto * 0.15);
            System.out.printf("No Dinheiro o valor do produto com desconto fica: %.2f", valorProdutoFinal);
        }
    },
    PIX(2){
        @Override
        public void calcularDesconto(double valorProduto) {
            double valorProdutoFinal = valorProduto - (valorProduto * 0.15);
            System.out.printf("No PIX o valor do produto com desconto fica: %.2f", valorProdutoFinal);
        }
    },
    CREDITO_A_VISTA(3){
        @Override
        public void calcularDesconto(double valorProduto) {
            double valorProdutoFinal = valorProduto - (valorProduto * 0.1);
            System.out.printf("No Credito a vista o valor do produto com desconto fica: %.2f", valorProdutoFinal);
        }
    },
    CREDITO_PARCELADO_2X(4){
        @Override
        public void calcularDesconto(double valorProduto) {
            System.out.println("No credito em 2x o valor do produto nao tem juros: " + valorProduto);
        }
    },
    CREDITO_PARCELADO_3X_MAIS(5){
        @Override
        public void calcularDesconto(double valorProduto) {
            double valorProdutoFinal = valorProduto + (valorProduto * 0.1);
            System.out.printf("No credito em 3x ou mais o valor do produto tem juros: %.2f", valorProdutoFinal);
        }
    };


    public static TipoPagamento procurarCodPagamento(int codPagamento){
        for (TipoPagamento tipo : TipoPagamento.values()){
            if (tipo.getCodPagamento() == codPagamento){
                return tipo;
            }
        }
        return null;
    }

    private final int codPagamento;

    public abstract void calcularDesconto(double valorProduto);


    TipoPagamento(int codPagamento) {
        this.codPagamento = codPagamento;
    }

    public int getCodPagamento() {
        return codPagamento;
    }
}
