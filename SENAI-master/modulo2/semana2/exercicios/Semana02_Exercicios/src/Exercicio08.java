import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        try {
            String a = null;
            int b=2, c =0, soma=0, div = 0;
            if(a.equals("jsk")){
                System.out.println("foi");
            }else{
                System.out.println("deu ruim");
            }
            soma=b+c;
            div=b/c;
        }catch (NullPointerException e){
            System.out.println( "String Nula");
        }
        catch (Exception exception){
            System.out.println("erro: "+ exception.getMessage());
        }
    }
}
