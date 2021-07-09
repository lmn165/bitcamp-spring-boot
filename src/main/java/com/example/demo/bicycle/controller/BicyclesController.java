package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicyclesController {
    BicycleDTO bicycle = new BicycleDTO();
    Scanner scanner = new Scanner(System.in);

    public void askBicycleInfo(){
        System.out.println("현재 기어 단계: ");
        bicycle.setCurrentGear(scanner.nextInt());
        System.out.println("분당 페달수: ");
        bicycle.setPedalCadence(scanner.nextInt());
        System.out.println("현재 속도: ");
        bicycle.setSpeed(scanner.nextDouble());
        System.out.println(bicycle.toString());
    }
}
