package Exercicio01;

public class Cliente {
    String nome;
    Double peso;
    Double altura;

    private Integer idade;

    public Cliente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Cliente(String nome, Double peso, Double altura, Integer idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String calcularImc() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 18.5) {
            return "Muito magro";
        } else if (imc >= 18.5 & imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25.0 & imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30.0 & imc <= 34.9) {
            return "Obeso grau I";
        } else if (imc >= 35d & imc <= 39.9) {
            return "Obeso grau II";
        } else{
            return "Obeso grau III ou Mórbido";
        }

    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
