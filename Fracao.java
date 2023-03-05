/**
 * Fracao
 */
public class Fracao {

    //Atributos: privados
    private int numerador;
    private int denominador;
    private double valor;
    //Métodos Construtores
    public Fracao() {
        //Se nada for passado, fração = 1/1
        this.numerador = 1;
        this.denominador = 1;
        this.valor = (double)1/1;
    }
    public Fracao(int numerador) {
        //Só um valor passado:n/1
        this.numerador = numerador;
        this.denominador = 1;
        this.valor = (double)numerador/1;
    }
    public Fracao(int numerador, int denominador) {
        
        this.numerador = numerador;
        this.denominador = denominador;
        this.valor = (double)numerador/denominador;
    }
    //Métodos Get e Set
    public int getNumerador() {
        return this.numerador;
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
        this.valor = (double)this.numerador/this.denominador; // Atualiza valor
    }
    public int getDenominador() {
        return this.denominador;
    }
    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
            this.valor = (double)this.numerador/this.denominador; // Atualiza o valor
        } else {
            System.out.println("ERRO: tentativa de denominador igual a zero!");
        }
    }
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeFracao(){
        System.out.println(this.numerador + "/" + this.denominador);
    }
}