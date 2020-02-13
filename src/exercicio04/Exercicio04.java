package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao",20,"São Paulo","40040440440");
        Funcionario funcionario = new Funcionario("Pedro",24,"Brasilia","R2804");
        cliente.exibirDados();
        System.out.println(" ");
        funcionario.exibirDados();
    }
}
