import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {

        String name="";
        ArrayList<String> listOfNames = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Nome (Para terminar digite 'fim'):");
            name = in.next();
            listOfNames.add(name);
        }while (!name.equals("fim"));
        listOfNames.remove(listOfNames.size()-1);
        Collections.sort(listOfNames);
        System.out.println(listOfNames);
    }
}
