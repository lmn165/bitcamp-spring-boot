package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccount;

public class BankAccountConstructorController {
    public static void main(String[] args) {
        BankAccount yoon = new BankAccount();   // 계좌 생성
        yoon.initAccount("12-34-89", "990990-9090990", 10000);  // 초기화

        BankAccount park = new BankAccount();   // 계좌 생성
        park.initAccount("33-55-09", "770088-5959007", 10000);  // 초기화

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
