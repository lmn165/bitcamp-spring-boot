package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;

import java.util.Scanner;

// OO(ObjectOrient) - 객체지향 (버전)
public class BankAccountController {
    private BankAccountDTO bank;
    // 메인 컨트롤러에서 bankJob 메소드를 호출할 때마다 BankAccountService 객체를 생성하지 않도록, 클래스 로딩시 한번만 생성하게 해준다.
    private final BankAccountService bankAccountService;
    private Scanner scanner;

    public BankAccountController(){
        // final 예약어가 걸린 변수는 선언시 초기화 혹은 생성자에서의 초기화만이 가능하다.
        bankAccountService = new BankAccountServiceImpl();
        // 두 개의 인스턴스 생성
        bank = new BankAccountDTO();
        scanner = new Scanner(System.in);
    }

    public void bankJob(){

//        BankAccountService park = new BankAccountServiceImpl();
        System.out.println("실행하실 기능을 선택하세요. (1.계좌생성, 2.입금, 3.출금, 4.예금조회, 5.계좌번호 조회, 6.계좌삭제, 7.계좌목록 조회)");
        switch (scanner.next()){
            case "1":
                System.out.println("예금주 명을 입력하세요.");
                bank.setName(scanner.next());
                bankAccountService.createAccount(bank);
                System.out.println("현재 잔액: "+bankAccountService.findBalance(bank));
                break;
            case "2":
                System.out.println("입금하실 계좌의 계좌번호를 입력하세요: ");
                bank.setAccountNumber(scanner.next());
                System.out.println("입금하실 금액을 입력하세요: ");
                bank.setMoney(scanner.nextInt());
                System.out.println(bankAccountService.deposit(bank));
                break;

//                System.out.println("입금하실 금액을 입력하세요: ");
//                bank.setMoney(scanner.nextInt());
//                System.out.println("입금 후 잔액: " + bankAccountService.deposit(bank));
//                break;
            case "3":
                System.out.println("출금하실 금액을 입력하세요: ");
                bank.setMoney(scanner.nextInt());
                System.out.println("출금 후 잔액: " + bankAccountService.withdraw(bank));
                break;
            case "4":
                System.out.println("현재 잔액: "+ bankAccountService.findBalance(bank));
                break;
            case "5":
//                System.out.println("전체 계좌번호 조회: "+ bankAccountService.findAllAccountNumber().toString());
                for (String s : bankAccountService.findAllAccountNumber()){
                    System.out.println("계좌번호: " + s);
                }
                break;
            case "6":
                System.out.println("해지하실 계좌의 계좌번호를 입력하세요: ");
                bank.setAccountNumber(scanner.next());
                System.out.println(bankAccountService.deleteAccounts(bank)?
                        "정상적으로 해지되었습니다.": "입력된 계좌번호가 조회되지 않습니다. 다시 확인해주세요.");
                break;
            case "7":
                System.out.printf("계좌는 총 %d개 있습니다.\n", bankAccountService.count());
                System.out.println(bankAccountService.showAccounts());
//                bankAccountService.showAccounts();
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
