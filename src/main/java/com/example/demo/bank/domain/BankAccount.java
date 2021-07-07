package com.example.demo.bank.domain;

public class BankAccount {
    private String accNumber;   // 계좌번호
    private String ssNumber;    // 주민번호
    private int balance;    // 예금 잔액

    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }
    public String getAccNumber(){
        return this.accNumber;
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

    public BankAccount(){}
    public BankAccount(String acc, String ss, int bal){ // 생성자
        accNumber = acc;
        ssNumber = ss;
        balance = bal;  // 계좌 개설 시 예금액으로 초기화
    }

    // 초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;  // 계좌 개설 시 예금액으로 초기화
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
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔액: " + balance + "\n");
        return balance;
    }
}
