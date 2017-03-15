/**
 * Created by marvi on 15.03.2017.
 */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Split extends Operatory {

    String algo(String eq) {

        String[] PossibleAction = {"*", "/", "+", "-"};

        StringTokenizer Elements = new StringTokenizer(eq, "+-*/", true);

        ArrayList<String> lista = new ArrayList<String>();

        while (Elements.hasMoreElements()) {
            lista.add(Elements.nextToken());
            //System.out.println(Elements.nextElement());
        }
        int x = 0;
        for (String A : PossibleAction) {
            while (lista.contains(A)) {
                int rev = lista.indexOf(A);
                //System.out.print("Index: " + rev + " of: " + A);
                double a = Double.parseDouble(lista.get(rev - 1));
                double b = Double.parseDouble(lista.get(rev + 1));
                //System.out.println(" = " + x);
                double r = 0;
                switch (x) {
                    case 0:
                        r = multiplication(a, b);
                        break;
                    case 1:
                        r = division(a, b);
                        break;
                    case 2:
                        r = addition(a, b);
                        break;
                    case 3:
                        r = subtraction(a, b);
                        break;
                }
                String eqR = String.valueOf(r);
                lista.set(rev, eqR);
                lista.remove(rev + 1);
                lista.remove(rev - 1);
            }
            x++;
        }
        return lista.get(0);
    }

}
