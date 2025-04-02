import java.util.Scanner;
import javax.script.*;
class EvaluateExpression {
    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String expression = sc.nextLine();
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println("Result: " + engine.eval(expression));
        sc.close();
    }
}