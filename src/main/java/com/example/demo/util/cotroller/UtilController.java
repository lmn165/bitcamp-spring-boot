package com.example.demo.util.cotroller;

import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.Scanner;

public class UtilController extends LambdaUtils {
    private UtilService utilService;
    public UtilController(){
        utilService = new UtilServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("[메뉴] 0.종료 1.현재날짜 및 시간\n");
            switch (scanner.next()){
                case "0": return;
                case "1": print.accept(utilService.todayAndCurrentTime()+"\n"); break;
            }
        }
    }
    /*public String randomNumbers(int digits){
        return utilService.randomNumbers(digits);
    }*/

}
