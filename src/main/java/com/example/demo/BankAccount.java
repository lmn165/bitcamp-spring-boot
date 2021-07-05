package com.example.demo;

public class BankAccount {
    int balance = 0;    // 예금 잔액

    public  int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}
