package org.midominio;


import org.midominio.behavioral.interpreter.AndExpression;
import org.midominio.behavioral.interpreter.Expression;
import org.midominio.behavioral.interpreter.OrExpression;
import org.midominio.behavioral.interpreter.TerminalExpression;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Interpreter 1
        Expression cero = new TerminalExpression("0");
        Expression uno = new TerminalExpression("1");

        Expression containBoolean = new OrExpression(cero,uno);
        Expression containOneAndCero = new AndExpression(cero,uno);

        System.out.println(containBoolean.interpret("cero"));
        System.out.println(containBoolean.interpret("0"));

        System.out.println(containOneAndCero.interpret("0"));
        System.out.println(containOneAndCero.interpret("0, 1"));
    }
}