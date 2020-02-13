package exercicio05;

public class PenaMoscito extends Escritor implements Escreve{
    public PenaMoscito(String ehFeitoDe, String escreveCom) {
        super(ehFeitoDe, escreveCom);
    }

    @Override
    public void escreve() {
        System.out.println("Escrevendo com "+getEscreveCom());
    }
}
