package exercicio05;

public class Caneta extends Escritor implements Escreve {
    public Caneta(String ehFeitoDe, String escreveCom) {
        super(ehFeitoDe, escreveCom);
    }

    @Override
    public void escreve() {
        System.out.println("Escrevendo com "+getEscreveCom());
    }
}
