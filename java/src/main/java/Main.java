import java.lang.groovy.util.Eval;

public class Main {
    public static void main(String[] args) {

//StringTokenizer(liczba, "+-*/", true)

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval("4*5");


        Expression e = new ExpressionBuilder("3 * sin(y) - 2 / (x - 2)")
                .variables("x", "y")
                .build()
                .setVariable("x", 2.3)
                .setVariable("y", 3.14);
        double result = e.evaluate();


        groovy.util.Eval.me("4*5");

        assert Eval.me(' 2 * 4 + 2');// == 10
        assert Eval.x(2, ' x * 4 + 2');// == 10


//isNumber
    }
}