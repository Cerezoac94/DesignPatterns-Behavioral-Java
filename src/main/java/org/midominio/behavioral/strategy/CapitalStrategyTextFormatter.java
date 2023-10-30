package org.midominio.behavioral.strategy;

//Concrete strategy
public class CapitalStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println("Texto en mayúsculas: " + text.toUpperCase());
    }
}
