package com.example.demo.bicycle;

import java.util.Scanner;

public class BicyclesMain {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 기어 단계: ");
        bicycle.setCurrentGear(scanner.nextInt());
        System.out.println("분당 페달수: ");
        bicycle.setPedalCadence(scanner.nextInt());
        System.out.println("현재 속도: ");
        bicycle.setSpeed(scanner.nextDouble());
        System.out.println(bicycle.toString());
    }
}
