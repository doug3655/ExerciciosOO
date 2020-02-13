package exercicio01;

public class CalcSomaTira {
    private double valor1;
    private double valor2;
    private double resultado;

    public CalcSomaTira(){

    }

    public CalcSomaTira(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double fazSoma(){
        this.resultado = this.valor1+this.valor2;
        return this.resultado;
    }

    public double fazTira(){
        this.resultado = this.valor1-this.valor2;
        return this.resultado;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
}
