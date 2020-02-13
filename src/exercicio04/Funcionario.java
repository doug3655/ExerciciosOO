package exercicio04;

public class Funcionario extends Pessoa {
    private String nMatricula;

    public Funcionario(String nome, int idade, String localNascimento, String nMatricula) {
        super(nome, idade, localNascimento);
        this.nMatricula = nMatricula;
    }

    @Override
    public void exibirDados(){
        System.out.println("Meus dados:");
        System.out.println("Nome:"+getNome());
        System.out.println("Idade:"+getIdade());
        System.out.println("Local de Nascimento:"+getLocalNascimento());
        System.out.println("Nº de Matricula:"+this.nMatricula);
    }
}
