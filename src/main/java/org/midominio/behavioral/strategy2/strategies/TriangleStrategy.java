package org.midominio.behavioral.strategy2.strategies;

//Concrete Strategy
public class TriangleStrategy implements Strategy{
    private double base, height;

    public TriangleStrategy(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public void CalculateArea() {
        double result = (base * height) / 2;
        System.out.println("El área del triángulo es: " + result);
    }
}
