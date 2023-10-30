package org.midominio;


//import org.midominio.behavioral.strategy.CapitalStrategyTextFormatter;
//import org.midominio.behavioral.strategy.Context;
//import org.midominio.behavioral.strategy.LowerStrategyTextFormatter;

import org.midominio.behavioral.strategy2.context.Context;
import org.midominio.behavioral.strategy2.strategies.CircleStrategy;
import org.midominio.behavioral.strategy2.strategies.TriangleStrategy;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Strategy 1
//        Context context = new Context(new CapitalStrategyTextFormatter());
//        context.publishText("Este texto deberá ser convertido a mayúsculas");
//
//        context = new Context(new LowerStrategyTextFormatter());
//        context.publishText("ESTE TEXTO DEBERÁ SER CONVERTIDO A MINÚSCULAS");

        //Strategy 2
        //circulo
        Context context = new Context(new CircleStrategy(13));
        context.calculateArea();

        //triangulo
        context = new Context(new TriangleStrategy(10, 7));
        context.calculateArea();

    }
}