import java.util.Objects;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String  end = "";
        do {
            double number1, number2, result = 0;
            int operator;
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um número:");
            number1 = in.nextDouble();
            System.out.println("Digite outro número:");
            number2 = in.nextDouble();
            System.out.println("Qual o número da operação matemática que deseja realizar:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            operator = in.nextInt();
            switch (operator) {
                case 1:
                    result = number1 + number2;
                    break;
                case 2:
                    result = number1 - number2;
                    break;
                case 3:
                    result = number1 * number2;
                    break;
                case 4:
                    result = number1 / number2;
                    break;
                default:
                    System.out.println("Operação desconhecida.");
            }
            System.out.println("O resultado da operação é igual a " + result);
            System.out.println("Digite 'sim' para continuar e 'fim' para terminar:");
            end = in.next();
        }while (!end.equals("fim"));
    }
}
