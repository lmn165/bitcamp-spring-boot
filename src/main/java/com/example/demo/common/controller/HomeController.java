package com.example.demo.common.controller;

import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.math.controller.GugudanController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BicyclesController bicyclesController = new BicyclesController();
        GugudanController gugudanController = new GugudanController();

        while (true){
            System.out.println("\n[메뉴] 0.종료, 1.계산기, 2.수열, 3.개 정보, 4.자전거 정보, 5.구구단 출력");
            switch (scanner.next()){
                case "0": return;
                case "1": calculatorController.calculate(); break;
                case "2": calculatorController.sequence(); break;
                case "3": dogController.askDogInfo(); break;
                case "4": bicyclesController.askBicycleInfo(); break;
                case "5": gugudanController.excuteGugudan(); break;
            }
        }
    }
}
