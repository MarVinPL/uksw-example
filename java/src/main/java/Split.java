/**
 * Created by marvi on 15.03.2017.
 */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Split {

    String eq;

    String Split(String eq) {
        Operatory Operator = new Operatory();

        String[] PossibleAction = {"*", "/", "+", "-"};

        StringTokenizer Elements = new StringTokenizer(eq, "+-*/^", true);

        System.out.println("Total tokens : " + Elements.countTokens());

        ArrayList<String> lista = new ArrayList<String>();

        while (Elements.hasMoreElements()) {
            lista.add(Elements.nextToken());
        }

        String Action;
        int Index = 0;

        for (String A : PossibleAction) {
            for (int i = 0; i < lista.size(); i++) {
                //if(element.equals("*"))
                if (lista.get(i).equals(A)) {
                    Action = A;
                    Index = i;
                }
                if (Index != 0) {
                    break;
                }
            }
        }

        //TODO: będzie liczyło w pętli dopuki Index!=0
        //TODO: jak Index==0 to zwraca wynik

        return eq;
    }

}
