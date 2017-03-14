import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*w w w  .j  ava 2  s.  c  o  m*/
public class Main {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        Object result = null;
        result = engine.eval("1 + 2;");
        System.out.println(result);
        result = engine.eval("1 + 2; 3 + 4;");
        System.out.println(result);
        result = engine.eval("1 + 2; 3 + 4; var v = 5; v = 6;");
        System.out.println(result);
        result = engine.eval("1 + 2; 3 + 4; var v = 5;");
        System.out.println(result);
        result = engine.eval("print(1 + 2)");
        System.out.println(result);

    }
}