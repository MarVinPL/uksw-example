import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String liczba = "2+53";

        StringTokenizer str2 = new StringTokenizer(liczba, "+-*/", true);

        while (str2.hasMoreElements()) {
            System.out.println(str2.nextElement());
        }

//isNumber
    }
}