package com.example.demo.math.domain;

public class CircleDTO {
    // 상수(Constant)
    final double PI = 3.141592;
    double radius;

    public CircleDTO(double radius) {
        this.radius = radius;
    }

    // 기능
    public double area() {
        return radius * radius * PI;
    }

    public double area(CircleDTO cir) {
        return cir.radius * cir.radius * PI;
    }
}
