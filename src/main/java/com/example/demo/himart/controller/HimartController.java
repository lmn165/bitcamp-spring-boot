package com.example.demo.himart.controller;

import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HimartController extends LambdaUtils {
    private Scanner scanner;
    private PhoneApp phone;

    public HimartController() {
        phone = new PhoneApp();
    }

    public void main() {
        scanner = new Scanner(System.in);
        while (true) {
            print.accept("[Menu] 0-종료 1-스마트폰 2- 3- \n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1": phoneMain(scanner); break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
            }

        }
    }

    public void phoneMain(Scanner scanner){
        while (true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시\n");
            switch (scanner.next()){
                case "0": return;
                case "1": break;
                case "2": break;
                case "3": break;
                case "4": break;
            }
        }
    }
}