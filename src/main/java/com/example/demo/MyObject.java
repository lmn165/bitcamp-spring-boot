package com.example.demo;

import java.util.Scanner;

public class MyObject {
    public static void main(String[] args) {
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt(); // 재사용성
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3);

        char a = '1';       // scalar - 단수값
        String a2 = "12";   // vector - 복수값
    }
}
