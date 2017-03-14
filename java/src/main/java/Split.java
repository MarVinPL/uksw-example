/**
 * Created by marvi on 15.03.2017.
 */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Split {

    Split(String eq) {
        String before = eq;
        String after;

        StringTokenizer Elements = new StringTokenizer(before, "+-*/^", true);

        System.out.println("Total tokens : " + Elements.countTokens());

        ArrayList<String> lista = new ArrayList<String>();

        while (Elements.hasMoreElements()) {
            lista.add(Elements.nextToken());
            //System.out.println(Elements.nextElement());
        }

        for (String element : lista) {

            element.equals('*');
            element.equals('/');
            element.equals('+');
            element.equals('-');

        }


        eq.replace(before, after);
    }
    //StringTokenizer Elements = new StringTokenizer(liczba, "+-*/^", true);
    //Elements.countTokens();//ilość elementów

}
