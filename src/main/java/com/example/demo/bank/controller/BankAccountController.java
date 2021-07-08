package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;

// OO(ObjectOrient) - 객체지향 (버전)
public class BankAccountController {

    public static void main(String[] args) {
        // 두 개의 인스턴스 생성
        BankAccountDTO yoon = new BankAccountDTO();
        BankAccountDTO park = new BankAccountDTO();

        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }

}
