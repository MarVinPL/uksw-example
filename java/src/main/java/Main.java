import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String liczba = "2+53*4/2";

        /*
        mnożenie
            dzielenie
                dodawanie
                        odejmowanie
                        */

        StringTokenizer Elements = new StringTokenizer(liczba, "+-*/^", true);

        System.out.println("Total tokens : " + Elements.countTokens());

        int[] values = new int[100];

        while (Elements.hasMoreElements()) {
            System.out.println(Elements.nextElement());
        }

//isNumber
    }
}