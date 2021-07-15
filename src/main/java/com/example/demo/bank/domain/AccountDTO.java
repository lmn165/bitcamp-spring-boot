package com.example.demo.bank.domain;

import lombok.Data;

@Data
public class AccountDTO {
    public static final String BANK_NAME = "비트은행";
    private String name;
    private String accountNumber;   // 계좌번호
    private String date;
    private String money;
    private String balance;    // 예금 잔액
    private String interest; // 이자율

    public String toString(){
        return String.format("예금주: %s, 계좌번호: %s", name, accountNumber);
    }
}
