package Exercicio01;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Camila";
        cliente.peso = 65d;
        cliente.altura = 1.6;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Julia";
        cliente2.peso = 60d;
        cliente2.altura = 1.6;

        Cliente cliente3 = new Cliente();
        cliente3.nome = "Paula";
        cliente3.peso = 70d;
        cliente3.altura = 1.7;

        cliente.calcularImc();

        Clinica clinica = new Clinica();
        clinica.adicionarCliente(cliente);
        clinica.adicionarCliente(cliente2);
        clinica.adicionarCliente(cliente3);

        clinica.categorizaCliente();

    }

}
