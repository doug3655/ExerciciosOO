package exercicio04;

public class Cliente extends Pessoa {
    private String cpf;
    public Cliente(String nome, int idade, String localNascimento,String cpf) {
        super(nome, idade, localNascimento);
        this.cpf = cpf;
    }

    @Override
    public void exibirDados(){
        System.out.println("Meus dados:");
        System.out.println("Nome:"+getNome());
        System.out.println("Idade:"+getIdade());
        System.out.println("Local de Nascimento:"+getLocalNascimento());
        System.out.println("CPF:"+this.cpf);
    }
}
