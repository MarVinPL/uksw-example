import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*  w  w w  .j a v  a2s.c om*/
public class Main {
    private int val = -1;

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Main result = new Main();
        engine.put("result", result);
        String script = "3 + 4; result.setValue(1);";
        engine.eval(script);
        int returnedValue = result.getValue();
        System.out.println("Returned value is " + returnedValue);
    }

    public int getValue() {
        return val;
    }

    public void setValue(int x) {
        val = x;
    }
}