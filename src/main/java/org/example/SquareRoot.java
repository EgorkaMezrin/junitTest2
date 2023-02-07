package org.example;

public class SquareRoot {
    public double a;
    public double calculateSquareRoot(double a){
        if(a<0){
            throw new ArithmeticException("Отрицательный аргумент.");
        }
        return Math.sqrt(a);
    }
}
