package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        CalcSomaTira calcSomaTira1 = new CalcSomaTira(10,20);
        CalcSomaTira calcSomaTira2 = new CalcSomaTira(15,25);
        CalcSomaTira calcSomaTira3 = new CalcSomaTira(32,64);

        System.out.println("Soma do 1 par: "+calcSomaTira1.fazSoma());
        System.out.println("Soma do 1 par: "+calcSomaTira2.fazTira());
        System.out.println("Soma do 1 par: "+calcSomaTira3.fazSoma());
    }
}
