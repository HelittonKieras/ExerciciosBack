import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        ArrayList<String> arrayNames = new ArrayList<>();
        String name;
        while (arrayNames.size() <= 9){
            Scanner in = new Scanner(System.in);
            System.out.println("Nome:");
            name = in.next();
            arrayNames.add(name);
        }
        for(int i=0 ; i <= arrayNames.size() ; i++){
            System.out.println( i+":"+ arrayNames.get(i));

        };
    }
}
