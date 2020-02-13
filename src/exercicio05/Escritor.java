package exercicio05;

public abstract class Escritor {
    private String ehFeitoDe;
    private String escreveCom;

    public Escritor(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    public String getEscreveCom() {
        return escreveCom;
    }
}
