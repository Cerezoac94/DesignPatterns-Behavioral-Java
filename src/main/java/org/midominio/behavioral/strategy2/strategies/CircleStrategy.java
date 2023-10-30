package org.midominio.behavioral.strategy2.strategies;

//Concrete Strategy
public class CircleStrategy implements Strategy {
    private double radius;

    public CircleStrategy(double radius){
        this.radius = radius;
    }
    @Override
    public void CalculateArea() {
        double result = 3.1416 * this.radius * this.radius;
        System.out.println("El área del círculo es: " + result );
    }
}
