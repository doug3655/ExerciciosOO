package exercicio04;

public class Pessoa {
    private String nome;
    private int idade;
    private String localNascimento;

    public Pessoa(String nome, int idade, String localNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.localNascimento = localNascimento;
    }
    public void exibirDados(){ }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }
}
