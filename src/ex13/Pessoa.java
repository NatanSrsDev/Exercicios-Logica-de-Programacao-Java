package ex13;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public boolean verificarIdade(){
        if (idade >= 18){
            System.out.println(nome + " é maior de idade");
            return true;
        } else {
            System.out.println(nome + " é menor de idade");
            return false;
        }
    }
}
