import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String liczba = "2+3*4/2";

        StringTokenizer Elements = new StringTokenizer(liczba, "+-*/^", true);

        System.out.println("Total tokens : " + Elements.countTokens());

        ArrayList<String> lista = new ArrayList<String>();

        while (Elements.hasMoreElements()) {
            lista.add(Elements.nextToken());
            //System.out.println(Elements.nextElement());
        }

        for (String elem : lista) {
            System.out.println(elem + "  ");
        }

//isNumber
    }
}