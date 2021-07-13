package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;

import java.util.Scanner;

// OO(ObjectOrient) - 객체지향 (버전)
public class BankAccountController {
    private BankAccountDTO bank;
    // 메인 컨트롤러에서 bankJob 메소드를 호출할 때마다 BankAccountService 객체를 생성하지 않도록, 클래스 로딩시 한번만 생성하게 해준다.
    private static final BankAccountService bankAccountService = new BankAccountServiceImpl();
    private Scanner scanner;

    public void bankJob(){
        // 두 개의 인스턴스 생성
        bank = new BankAccountDTO();
        scanner = new Scanner(System.in);

//        BankAccountService park = new BankAccountServiceImpl();
        System.out.println("실행하실 기능을 선택하세요. (1.계좌생성, 2.입금, 3.출금, 4.예금조회, 5.계좌번호 조회)");
        switch (scanner.next()){
            case "1":
                System.out.println("예금주 명을 입력하세요.");
                bank.setName(scanner.next());
                bankAccountService.createAccount(bank);
                System.out.println("현재 잔액: "+bankAccountService.findBalance(bank));
                break;
            case "2":
                System.out.println("입금하실 금액을 입력하세요: ");
                bank.setMoney(scanner.nextInt());
                System.out.println("입금 후 잔액: " + bankAccountService.deposit(bank));
                break;
            case "3":
                System.out.println("출금하실 금액을 입력하세요: ");
                bank.setMoney(scanner.nextInt());
                System.out.println("출금 후 잔액: " + bankAccountService.withdraw(bank));
                break;
            case "4":
                System.out.println("현재 잔액: "+ bankAccountService.findBalance(bank));
                break;
            case "5":
                System.out.println("계좌번호: "+ bankAccountService.findAccount());
                break;
        }

        // 각 인스턴스를 대상으로 예금을 진행
//        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
//        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
//        park.checkMyBalance();
    }


}
