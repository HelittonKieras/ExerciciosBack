import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        try{
            int one = 2;
            int two = one/0;
        }catch (Exception exception){
            System.out.println("erro: "+exception.getMessage());
        }
    }
}
