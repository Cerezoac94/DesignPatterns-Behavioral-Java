package org.midominio.behavioral.strategy2.strategies;

//Concrete Strategy
public class SquareStrategy implements Strategy {
    private double side;

    public SquareStrategy(double side){
        this.side = side;
    }


    @Override
    public void CalculateArea() {
        double result = this.side + this.side;
        System.out.println("El área del cuadrado es: " + result);
    }
}
