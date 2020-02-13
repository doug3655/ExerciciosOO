package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(10,20);
        Triangulo triangulo2 = new Triangulo(15,10);
        Triangulo triangulo3 = new Triangulo(50,80);

        System.out.println("Area do Triangulo 1 = "+triangulo1.calcularArea());
        System.out.println("Area do Triangulo 2 = "+triangulo2.calcularArea());
        System.out.println("Area do Triangulo 3 = "+triangulo3.calcularArea());
    }
}
