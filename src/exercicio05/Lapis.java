package exercicio05;

public class Lapis extends Escritor implements Escreve {
    public Lapis(String ehFeitoDe, String escreveCom) {
        super(ehFeitoDe, escreveCom);
    }

    @Override
    public void escreve() {
        System.out.println("Escrevendo com "+getEscreveCom());
    }
}
