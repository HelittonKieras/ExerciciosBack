package Metodos;

public class MainCalculadora {
    public static void main(String[] args) {
        helloWorld();
        Calculadora calculadora = new Calculadora();
        calculadora.soma(2.0,3.0);
        calculadora.multiplicacao(2.0,6.0);
        calculadora.subtracao(5.0,4.0);
        calculadora.imprimeResultado();
//        calculadora.printHistoricos();

    }

    public static void helloWorld(){
        System.out.println("Hello World");
    }

}

