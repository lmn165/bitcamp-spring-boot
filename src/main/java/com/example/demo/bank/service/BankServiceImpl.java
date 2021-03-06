package com.example.demo.bank.service;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {
    private AccountDTO account;
    private final List<AccountDTO> bankAccounts;
    private UtilService utilService;

    public BankServiceImpl(){
        bankAccounts = new ArrayList<>();
    }

    @Override
    public String[] findAllAccountNumber() {
        String[] arr = new String[strToInt.apply(count())];
        for (int i=0; i<arr.length; i++){
            arr[i] = bankAccounts.get(i).getAccountNumber();
        }
//        List<String> accountsInfo = new ArrayList<>();
//        for (BankAccountDTO bankAccount : bankAccounts) {
//            accountsInfo.add(bankAccount.getAccountNumber());
//        }
        return arr;
    }

    @Override
    public Boolean dropAccount(AccountDTO bank) {
        int cnt = 0;
        for(AccountDTO account : bankAccounts){
            // == 비교연산자로 비교 불가!
            // 서로 다른 객체주소를 참조하고 있기 때문이다.
            if (account.getAccountNumber().equals(bank.getAccountNumber())){
                bankAccounts.remove(cnt);
                return true;
            }
            cnt++;
        }
        return false;
    }

    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override
    public List<?> showAccounts() {
        return bankAccounts;
    }

    @Override
    public void createAccount(AccountDTO bank) {
        account  = new AccountDTO();
        utilService = new UtilServiceImpl();
        String firstNumber = utilService.randomNumbers(4);
        String randomNumber = String.format("%s-%s",
                utilService.randomNumbers(4), utilService.randomNumbers(4));
        while (true){
            if(firstNumber.substring(0, 1).equals("0")){
                firstNumber = utilService.randomNumbers(4);
            }
            break;
        }
        account.setBalance("0");
        account.setDate(utilService.todayAndCurrentTime());
        account.setInterest("0.01");
        /*for(int i=0; i<3; i++){
            randomNumber += utilService.randomNumbers(4);
            randomNumber += "-";
        }
        randomNumber = randomNumber.substring(0, randomNumber.length()-1);*/
        account.setAccountNumber(firstNumber + "-" + randomNumber);
        account.setName(bank.getName());
        bankAccounts.add(account);
    }

    @Override
    public AccountDTO findAccount(AccountDTO bank) {
        for(AccountDTO account : bankAccounts){
            if (bank.getAccountNumber().equals(account.getAccountNumber())){
                return account;
            }
        }
        return null;
    }

    @Override
    public String deposit(AccountDTO bank) {
        for(AccountDTO account : bankAccounts){
            if (bank.getAccountNumber().equals(account.getAccountNumber())){
                account.setBalance(string.apply(strToInt.apply(account.getBalance()) + strToInt.apply(bank.getMoney())) );
                return account.getBalance();
            }
        }
        return "0";
    }

    @Override
    public String withdraw(AccountDTO bank) {
        for(AccountDTO account : bankAccounts){
            if (bank.getAccountNumber().equals(account.getAccountNumber())){
                account.setBalance(string.apply(strToInt.apply(account.getBalance()) - strToInt.apply(bank.getMoney())));
                return account.getBalance();
            }
        }
        return "0";
    }

//    @Override
//    public String findBalance() {
//        return account.getAccountNumber();
//    }
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