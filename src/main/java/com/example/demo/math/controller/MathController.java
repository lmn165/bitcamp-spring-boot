package com.example.demo.math.controller;

import com.example.demo.math.domain.MathDTO;
import com.example.demo.math.service.MathService;
import com.example.demo.math.service.MathServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class MathController extends LambdaUtils {
    private final MathService mathService;

    public MathController(){
        mathService = new MathServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("[메뉴] 0.종료 1.계산기 2.수열 3.구구단\n");
            switch (scanner.next()){
                case "0": return;
                case "1": calculate(scanner); break;
                case "2": sequence(scanner); break;
                case "3": excuteGugudan(); break;
            }
        }
    }

    public void calculate(Scanner scanner){
        MathDTO math = new MathDTO();
        print.accept("숫자 1 ?");
        math.setNum1(scanner.nextInt());
        print.accept("연산자: ");
        math.setOpcode(scanner.next());
        print.accept("숫자 2 ?");
        math.setNum2(scanner.nextInt()); // 재사용성
        int result = 0;
        // if(조건부: Conditon) {}, switch(Conditon){}
        switch (math.getOpcode()){
            case "+":
                result = mathService.add(math);
                break;
            case "-":
                result = mathService.subtract(math);
                break;
            case "*":
                result = mathService.multiple(math);
                break;
            case "/":
                result = mathService.divide(math);
                break;
            case "%":
                result = mathService.remain(math);
                break;
        }

        print.accept(String.format("%d %s %d = %d\n",
                math.getNum1(),
                math.getOpcode(),
                math.getNum2(),
                result));
    }

    public void sequence(Scanner scanner){
        MathDTO math = new MathDTO();
        print.accept("수열의 시작값: ");
        math.setNum1(scanner.nextInt());
        print.accept("수열의 마지막값: ");
        math.setNum2(scanner.nextInt()); // 재사용성
        int[] arr = mathService.sequence(math);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        print.accept("\n");
    }

    public void excuteGugudan(){
        for(int i=2; i<10; i++){
            print.accept(i + "단 ");
            for(int j=1; j<10; j++){
                print.accept(String.format("%d * %d = %d\t", i, j, i*j));
            }
            print.accept("\n");
//            System.out.println("\n=============================================================================================================");
        }
    }


}
