import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        number1 = in.nextDouble();
        System.out.println("Digite outro número:");
        number2 = in.nextDouble();
        result = number1 + number2;
        System.out.println(number1 +" + "+ number2 + " = " + result);
    }
}
