package com.example.demo.bank.service;

import com.example.demo.bank.domain.AccountDTO;

import java.util.List;

/**
 * * 은행이름은 상수로 정한다. (모든 기능에 들어가기 때문에)
 * 계좌생성 - 이름을 입력하면 계좌가 생성된다. (단, 계좌번호는 ****-****-**** 이고 랜덤값이다.)
 * 입금 - 이름 사람, 금액, 계좌번호를 입력한 후 잔액을 확인한다.
 * 출금 - 이름, 금액, 계좌번호를 출금한 후 잔액을 확인한다.
 * 잔액확인 - 이름, 금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다.
 * 계좌해지 - 이름, 계좌번호를 입력한 후 계좌를 해지한다.
**/
 public interface BankService {
  void createAccount(AccountDTO bank);
  AccountDTO findAccount(AccountDTO bank);
  String deposit(AccountDTO bank);
  String withdraw(AccountDTO bank);
//  String findBalance();

  // 계좌 갯수 조회
  String count();
  // 전체 계좌 조회(이름, 계좌번호)
  List<?> showAccounts();
  // 계좌 삭제
  Boolean dropAccount(AccountDTO bank);
  // 계좌 번호만 조회
  String[] findAllAccountNumber();
}
