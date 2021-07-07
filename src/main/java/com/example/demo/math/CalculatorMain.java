package com.example.demo.math;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        cal.setNum1(scanner.nextInt());
        System.out.println("숫자 2 ?");
        cal.setNum2(scanner.nextInt()); // 재사용성
        cal.setNum3(cal.getNum1() + cal.getNum2());
        System.out.println(cal.getNum3());

        char a = '1';       // scalar - 단수값
        String a2 = "12";   // vector - 복수값
    }
}
