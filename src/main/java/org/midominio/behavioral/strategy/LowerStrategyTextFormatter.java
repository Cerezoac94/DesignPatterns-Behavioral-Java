package org.midominio.behavioral.strategy;

//Concrete strategy
public class LowerStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println("Texto en minúsculas: " + text.toLowerCase());
    }
}
