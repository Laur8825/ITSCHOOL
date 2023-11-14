package session11.practice.math_example;

import static session11.practice.math_example.MathConstants.PI;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return PI*radius*radius;
    }
}
