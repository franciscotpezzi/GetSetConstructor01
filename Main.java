public class Main {
    public static void main(String[] args) {
        Fracao frac1 = new Fracao(); //fração 1/1
        Fracao frac2 = new Fracao(2); // fração 2/1
        Fracao frac3 = new Fracao(3, 2); //fração 3/2 
        //Visualizando as 3 frações
        frac1.imprimeFracao();
        frac2.imprimeFracao();
        frac3.imprimeFracao();
        //Usando os gets na fração 3/2:
        System.out.println("Numerador de 3/2: "+ frac3.getNumerador());
        System.out.println("Denominador de 3/2: "+ frac3.getDenominador());
        System.out.println("Valor de 3/2: "+frac3.getValor());
        //Mudando 3/2 para 5/2:
        frac3.setNumerador(5);
        frac3.imprimeFracao();
        System.out.println("Valor de " + frac3.getNumerador() + "/2: "+frac3.getValor());
        //Tentando mudar 5/2 para 5/0:
        frac3.setDenominador(0);
        frac3.imprimeFracao();
    }
       
    
}
