package com.example.demo.common.controller;

import com.example.demo.bank.controller.BankController;
import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.MathController;
import com.example.demo.util.cotroller.UtilController;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("\n[메뉴] 0.종료, 1.유틸, 2.수학, 3.개, 4.자전거, 5.은행업무\n");
            switch (scanner.next()){
                case "0": return;
                case "1": new UtilController().main(); break;
                case "2": new MathController().main(); break;
                case "3": new DogController().main(); break;
                case "4": new BicyclesController().main(); break;
                case "5": new BankController().bankJob(); break;
            }
        }
    }
}
