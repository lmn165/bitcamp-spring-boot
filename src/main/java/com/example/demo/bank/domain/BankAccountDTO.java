package com.example.demo.bank.domain;

public class BankAccountDTO {
    private String name, bankName;
    private String accountNumber;   // 계좌번호
    private String date;
    private int money;    // 예금 잔액
    private float interest; // 이자율
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

}
