package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;
    private Random random;

    @Override
    public void createAccount(BankAccountDTO bank) {
        random = new Random();
        bankAccount  = new BankAccountDTO();
        String randomNumber = "";
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                randomNumber += random.nextInt(10);
            }
            randomNumber += "-";
        }
        randomNumber = randomNumber.substring(0, randomNumber.length()-1);
        bankAccount.setAccountNumber(randomNumber);
        bankAccount.setName(bank.getName());
    }

    @Override
    public int findBalance(BankAccountDTO bank) {
        return bankAccount.getBalance();
    }

    @Override
    public int deposit(BankAccountDTO bank) {
        bankAccount.setBalance(bankAccount.getBalance() + bank.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public int withdraw(BankAccountDTO bank) {
        bankAccount.setBalance(bankAccount.getBalance() - bank.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {

    }

    @Override
    public String findAccount() {
        return bankAccount.getAccountNumber();
    }
}
/**
 private int balance;
 private String ssNumber;

 public BankAccountDTO(){}
 public BankAccountDTO(String acc, String ss, int bal){ // 생성자
 accountNumber = acc;
 ssNumber = ss;
 balance = bal;  // 계좌 개설 시 예금액으로 초기화
 }

 // 초기화를 위한 메소드
 public void initAccount(String acc, String ss, int bal){
 accountNumber = acc;
 ssNumber = ss;
 balance = bal;  // 계좌 개설 시 예금액으로 초기화
 }

 public void setAccNumber(String accNumber){
 this.accountNumber = accNumber;
 }
 public String getAccNumber(){
 return this.accountNumber;
 }
 public void setSsNumber(String ssNumber){
 this.ssNumber = ssNumber;
 }
 public String getSsNumber(){
 return this.ssNumber;
 }
 public void setBalance(int balance){
 this.balance = balance;
 }
 public int getBalance(){
 return this.balance;
 }

 public  int deposit(int amount){
 balance += amount;
 return balance;
 }
 public int withdraw(int amount){
 balance -= amount;
 return balance;
 }
 public int checkMyBalance() {
 System.out.println("계좌번호: " + accountNumber);
 System.out.println("주민번호: " + ssNumber);
 System.out.println("잔액: " + balance + "\n");
 return balance;
 }
 * */