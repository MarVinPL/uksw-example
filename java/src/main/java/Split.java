/**
 * Created by marvi on 15.03.2017.
 */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Split extends Operatory {

    /**
     * usuwam podejżane znaki
     * robie liste
     * sprawdzam pierwszyz znak i jakoś sobie z nim radze
     *
     * @param eq             równanie
     * @param lista          z danymi
     * @param Elements       after StringTokenizer
     * @param first          czy pierwszy element
     * @param token          do temp nextToken
     * @param a              czawoso trzymam skonwertowane liczby
     * @param b              czawoso trzymam skonwertowane liczby
     * @param PossibleAction możliwe znaki
     * @param rev            "wskaźnik"
     * @author MarVin
     */
    String algo(String eq) {

        eq = eq.replaceAll("\\s+", "");
        eq = eq.replaceAll("\\s", "");
        eq = eq.trim();

        eq = eq.replaceAll("[^0-9*/+-]", "");

        ArrayList<String> lista = new ArrayList<String>();

        StringTokenizer Elements = new StringTokenizer(eq, "*/+-", true);

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

        /*
        "*""-""1" to "*""-1"
        */

        String[] PossibleAction = {"*", "/", "-", "+"};
        for (int i = 0; i < 4; i++) {
            while (lista.contains(PossibleAction[i])) {
                int rev = lista.indexOf(PossibleAction[i]);

                if (lista.get(rev + 1).equals("-")) {
                    lista.remove(rev + 1);
                    lista.set(rev + 1, "-" + lista.get(rev + 1));
                    //System.out.println(lista.get(rev+1));
                }

                double a = Double.parseDouble(lista.get(rev - 1));
                double b = Double.parseDouble(lista.get(rev + 1));
//TODO: KTÓRE LEPRZE
                //Double temp = Double.valueOf(lista.get(rev - 1));
                //a = temp.doubleValue();
                //temp = Double.valueOf(lista.get(rev + 1));
                //b = temp.doubleValue();

                //System.out.println(" = " + x);
                double r = 0;
                switch (i) {
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
        }
        return lista.get(0);
    }

}
