import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String liczba = "3/2+3*4/2-1";

        StringTokenizer Elements = new StringTokenizer(liczba, "+-*/", true);

        //System.out.println("Total tokens : " + Elements.countTokens());

        ArrayList<String> lista = new ArrayList<String>();

        while (Elements.hasMoreElements()) {
            lista.add(Elements.nextToken());
            //System.out.println(Elements.nextElement());
        }

        //System.out.println(lista.get(1));
        //System.out.println(lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("");
        System.out.println("");

        int rev = lista.indexOf("/");

        System.out.println(rev);

        String[] PossibleAction = {"*", "/", "+", "-"};

        Operatory o = new Operatory();
        int x = 0;
        for (String A : PossibleAction) {
            while (lista.contains(A)) {
                System.out.print("Index: " + rev + " of: " + A);
                rev = lista.indexOf(A);
                double a = Double.parseDouble(lista.get(rev - 1));
                double b = Double.parseDouble(lista.get(rev + 1));
                System.out.println(" = " + x);
                o.addition();
                o.subtraction();
                o.multiplication();
                o.division();
                    double tmp = a + b;

                String eq = String.valueOf(tmp);
                lista.set(rev, eq);
                lista.remove(rev + 1);
                lista.remove(rev - 1);
            }
            x++;
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

//isNumber
    }
}