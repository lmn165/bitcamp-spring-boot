package com.example.demo.common.controller;

import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.math.controller.GugudanController;
import com.example.demo.util.cotroller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicyclesController bicyclesController = new BicyclesController();
        BankAccountController bankAccountController = new BankAccountController();

        while (true){
            System.out.println("\n[메뉴] 0.종료, 1.계산기, 2.수열, 3.개등록, 33.개목록, 4.자전거등록, 44.자전거목록, 5.구구단 출력, 6.오늘날짜, 7.은행업무");
            switch (scanner.next()){
                case "0": return;
                case "1": new CalculatorController().calculate(); break;
                case "2": new CalculatorController().sequence(); break;
                case "3":
                    DogDTO dog = new DogDTO();
                    System.out.println("이름이 무엇입니까?");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 무엇입니까?");
                    dog.setColor(scanner.next());
                    System.out.println("품종은 무엇입니까?");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
//                    DogController dogController = new DogController(new DogServiceImpl(dog));
//                    System.out.println(dogController.barking("왈왈"));
                break;
                case "33":
                    dogController.show();
                    break;
                case "4":
                    BicycleDTO bicycle = new BicycleDTO();
                    System.out.println("현재 기어 단계: ");
                    bicycle.setCurrentGear(scanner.nextInt());
                    System.out.println("분당 페달수: ");
                    bicycle.setPedalCadence(scanner.nextInt());
                    System.out.println("현재 속도: ");
                    bicycle.setSpeed(scanner.nextDouble());
                    bicyclesController.addBicycles(bicycle);
                break;
                case "44":
                    System.out.printf("자전거는 총 %d대 있습니다.", bicyclesController.countBicycles());
                    bicyclesController.showBicycles();
                    break;
                case "5": new GugudanController().excuteGugudan(); break;
                case "6": new UtilController().todayAndCurrentTime(); break;
                case "7": bankAccountController.bankJob(); break;
            }
        }
    }
}
