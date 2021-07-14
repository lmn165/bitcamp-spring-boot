package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class BicyclesController {
    // 자전거 등록, 목록 출력
    private BicycleDTO bicycle;
    private Scanner scanner;
    private BicycleService bicycleService;
    public BicyclesController(){
        bicycle = new BicycleDTO();
        scanner = new Scanner(System.in);
        bicycleService = new BicycleServiceImpl();
    }

    public void addBicycles(BicycleDTO bicycle) {
        bicycleService.addBicycles(bicycle);
    }

    public void showBicycles() {
        System.out.println(bicycleService.showBicycles());
    }

    public int countBicycles() {
        return bicycleService.countBicycles();
    }


    // 자전거 기본 정보
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
