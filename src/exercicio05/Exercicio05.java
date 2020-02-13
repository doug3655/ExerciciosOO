package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Plastico","Tinta");
        Lapis lapis = new Lapis("Madeira","Grafite");
        PenaMoscito penaMoscito = new PenaMoscito("Metal","Nanquim");

        caneta.escreve();
        lapis.escreve();
        penaMoscito.escreve();
    }
}
