/**
 * Created by marvi on 15.03.2017.
 */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Split extends Operatory {

    String algo(String eq) {

        eq.replaceAll("\\s+", "");
        eq.replaceAll("\\s", "");

        StringTokenizer Elements = new StringTokenizer(eq, "+-*/", true);

        ArrayList<String> lista = new ArrayList<String>();

        boolean first = true;
        while (Elements.hasMoreElements()) {
            String token = Elements.nextToken();
            if (first) {
                if (token.equals("-"))
                    lista.add("0");
                first = false;
            }
            lista.add(token);
        }

        String[] PossibleAction = {"*", "/", "-", "+"};
        int x = 0;
        for (int i = 0; i < 4; i++) {
            while (lista.contains(PossibleAction[i])) {
                int rev = lista.indexOf(PossibleAction[i]);
                //System.out.print("Index: " + rev + " of: " + A);

                double a = Double.parseDouble(lista.get(rev - 1));
                double b = Double.parseDouble(lista.get(rev + 1));
//TODO: KTÓRE LEPRZE
                Double temp = Double.valueOf(lista.get(rev - 1));
                a = temp.doubleValue();
                temp = Double.valueOf(lista.get(rev + 1));
                b = temp.doubleValue();

                //System.out.println(" = " + x);
                double r = 0;
                switch (x) {
                    case 0:
                        r = multiplication(a, b);
                        break;
                    case 1:
                        //System.out.println(b);
                        if (b == 0) {
                            return "?";
                            //break;
                        }
                        r = division(a, b);
                        break;
                    case 3:
                        r = addition(a, b);
                        break;
                    case 2:
                        r = subtraction(a, b);
                        break;
                }
                //System.out.println(r);
                String eqR = String.valueOf(r);
                lista.set(rev, eqR);
                lista.remove(rev + 1);
                lista.remove(rev - 1);
            }
            ++x;
        }
        return lista.get(0);
    }

}
