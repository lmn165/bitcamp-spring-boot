package com.example.demo.math.controller;

import com.example.demo.math.domain.CircleDTO;

class CircleController{

    public void circle(){
        CircleDTO circle = new CircleDTO(1.0);
        CircleDTO circle1 = new CircleDTO(2.0);
        System.out.println(circle.area());
        System.out.println(circle.area(circle));
//        System.out.println(circle.area(circle1));
    }

}