package com.example.demo.math;

public class Circle {
    // 상수(Constant)
    final double PI = 3.141592;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    // 기능
    public double area(){
        return radius * radius * PI;
    }
    public double area(Circle cir){
        return cir.radius * cir.radius * PI;
    }
}

class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        Circle circle1 = new Circle(2.0);
        System.out.println(circle.area());
        System.out.println(circle.area(circle));
//        System.out.println(circle.area(circle1));
    }
}