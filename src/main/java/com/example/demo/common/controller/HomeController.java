package com.example.demo.common.controller;

import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.math.controller.GugudanController;
import com.example.demo.util.cotroller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n[메뉴] 0.종료, 1.계산기, 2.수열, 3.개 정보, 4.자전거 정보, 5.구구단 출력, 6.오늘날짜, 7.은행업무");
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
                    DogController dogController = new DogController(new DogServiceImpl(dog));
                    System.out.println(dogController.barking("왈왈"));
                break;
                case "4": new BicyclesController().askBicycleInfo(); break;
                case "5": new GugudanController().excuteGugudan(); break;
                case "6": new UtilController().todayAndCurrentTime(); break;
                case "7": new BankAccountController().bankJob(); break;
            }
        }
    }
}
