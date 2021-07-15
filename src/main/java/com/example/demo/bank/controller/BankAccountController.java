package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

// OO(ObjectOrient) - 객체지향 (버전)
public class BankAccountController extends LambdaUtils {
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
        int result;
//        BankAccountService park = new BankAccountServiceImpl();
        print.accept("실행하실 기능을 선택하세요. (1.계좌생성, 2.입금, 3.출금, 4.통장조회, 5.계좌번호 조회, 6.계좌삭제, 7.계좌목록 조회)\n");
        switch (scanner.next()){
            case "1":
                print.accept("예금주 명을 입력하세요.\n");
                bank.setName(scanner.next());
                bankAccountService.createAccount(bank);
                print.accept("통장이 개설되었습니다.\n");
                break;
            case "2":
                print.accept("입금하실 통장의 계좌번호를 입력하세요: \n");
                bank.setAccountNumber(scanner.next());
                print.accept("입금하실 금액을 입력하세요: \n");
                bank.setMoney(scanner.next());
                result = strToInt.apply(bankAccountService.deposit(bank));
                print.accept(result!=0 ? String.format("입금 후 잔액 : %d\n",result) : "계좌입력 오류가 발생했습니다.\n");
                break;

//                System.out.println("입금하실 금액을 입력하세요: ");
//                bank.setMoney(scanner.nextInt());
//                System.out.println("입금 후 잔액: " + bankAccountService.deposit(bank));
//                break;
            case "3":
                print.accept("출금하실 통장의 계좌번호를 입력하세요: \n");
                bank.setAccountNumber(scanner.next());
                print.accept("출금하실 금액을 입력하세요: \n");
                bank.setMoney(scanner.next());
                result = strToInt.apply(bankAccountService.withdraw(bank));
                print.accept(result!=0 ? String.format("출금 후 잔액 : %d\n",result) : "없는 계좌번호 입니다.\n");
                
//                System.out.println("출금하실 금액을 입력하세요: ");
//                bank.setMoney(scanner.nextInt());
//                System.out.println("출금 후 잔액: " + bankAccountService.withdraw(bank));
                break;
            case "4":
                print.accept("조회하실 통장의 계좌번호를 입력하세요: \n");
                bank.setAccountNumber(scanner.next());
                BankAccountDTO tmpBank = bankAccountService.findBalance(bank);
                if(tmpBank != null){
                    print.accept(String.format("은행명: %s\n예금주: %s\n계좌번호: %s\n잔액: %s\n",
                            bank.BANK_NAME, tmpBank.getName(), tmpBank.getAccountNumber(), tmpBank.getBalance()));
                } else {
                    print.accept("없는 계좌번호 입니다.\n");
                }
                break;
            case "5":

                for (String s : bankAccountService.findAllAccountNumber()){
                    print.accept(String.format("계좌번호: %s\n", s));
                }
                break;
            case "6":
                print.accept("해지하실 계좌의 계좌번호를 입력하세요: \n");
                bank.setAccountNumber(scanner.next());
                print.accept(bankAccountService.deleteAccounts(bank)?
                        "정상적으로 해지되었습니다.\n": "입력된 계좌번호가 조회되지 않습니다. 다시 확인해주세요.\n");
                break;
            case "7":
                print.accept(String.format("계좌는 총 %s개 있습니다.\n", bankAccountService.count()));

                List<BankAccountDTO> list = (List<BankAccountDTO>) bankAccountService.showAccounts();
                for (BankAccountDTO b : list){
                    print.accept(string.apply(b)+"\n");
                }
//                print.accept(string.apply(bankAccountService.showAccounts()));
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
