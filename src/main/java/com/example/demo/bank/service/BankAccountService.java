package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

/**
 * * 은행이름은 상수로 정한다. (모든 기능에 들어가기 때문에)
 * 입금 - 이름 사람, 금액, 계좌번호를 입력한 후 잔액을 확인한다.
 * 출금 - 이름, 금액, 계좌번호를 출금한 후 잔액을 확인한다.
 * 잔액확인 - 이름, 금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다.
 * 계좌생성 - 이름을 입력하면 계좌가 생성된다.
 * 계좌해지 - 이름, 계좌번호를 입력한 후 계좌를 해지한다.
**/
 public interface BankAccountService {
  /*int deposit(BankAccountDTO bankAccount);
  int withdraw(BankAccountDTO bankAccount);
  int remainMoney(BankAccountDTO bankAccount);
  void createAccount(BankAccountDTO bankAccount);
  void deleteAccount(BankAccountDTO bankAccount);*/
}
