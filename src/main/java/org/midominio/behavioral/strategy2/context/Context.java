package org.midominio.behavioral.strategy2.context;

import org.midominio.behavioral.strategy2.strategies.Strategy;

//Context
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void calculateArea(){
        strategy.CalculateArea();
    }
}
