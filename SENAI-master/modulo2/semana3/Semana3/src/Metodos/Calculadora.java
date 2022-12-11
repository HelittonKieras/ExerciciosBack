package Metodos;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    List<Double> hitoricoResultado = new ArrayList<>();

    public Double soma(Double numero1, Double numero2) {
        Double resultado = numero1 + numero2;
        hitoricoResultado.add(resultado);
        System.out.println("Soma Realizada!!");
        return resultado;
    }

    public Double multiplicacao(Double numero1, Double numero2) {
        Double resultado = numero1 * numero2;
        hitoricoResultado.add(resultado);
        return resultado;
    }

    public Double subtracao(Double numero1, Double numero2) {
        Double resultado = numero1 - numero2;
        hitoricoResultado.add(resultado);
        return resultado;
    }

    public Double divisao(Double numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        hitoricoResultado.add(resultado);
        return resultado;
    }

    public void imprimeResultado() {
        hitoricoResultado.forEach(r -> System.out.println(r));
    }
//    public void printHistoricos() {
//        historicoResultado.forEach(r -> System.out.println(r));
//
//        for (Double resultado : historicoResultado) {
//            System.out.println("O resultado foi: " + resultado);
//        }
//        for (int i = 0; i < historicoResultado.size(); i++) {
//            System.out.println(
//                    "O resultado da conta " + i + " foi: " + historicoResultado.get(i)
//            );
//        }
//    }
}

