import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String liczba = "2+3*4/2";

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
            //if(element.equals("*"))
            if (lista.get(i).equals("*")) {
                double a = Double.parseDouble(lista.get(i - 1));
                double b = Double.parseDouble(lista.get(i + 1));
                double tmp = a * b;
                String eq = String.valueOf(tmp);
                lista.set(i, eq);
                lista.remove(i + 1);
                lista.remove(i - 1);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            //if(element.equals("*"))
            if (lista.get(i).equals("/")) {
                double a = Double.parseDouble(lista.get(i - 1));
                double b = Double.parseDouble(lista.get(i + 1));
                double tmp = a / b;
                String eq = String.valueOf(tmp);
                lista.set(i, eq);
                lista.remove(i + 1);
                lista.remove(i - 1);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            //if(element.equals("*"))
            if (lista.get(i).equals("+")) {
                double a = Double.parseDouble(lista.get(i - 1));
                double b = Double.parseDouble(lista.get(i + 1));
                double tmp = a + b;
                String eq = String.valueOf(tmp);
                lista.set(i, eq);
                lista.remove(i + 1);
                lista.remove(i - 1);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

//isNumber
    }
}