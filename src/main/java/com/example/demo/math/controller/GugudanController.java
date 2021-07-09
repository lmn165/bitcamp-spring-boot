package com.example.demo.math.controller;
// 구구단 연습
public class GugudanController {

    public void excuteGugudan(){
        for(int i=2; i<10; i++){
            System.out.println(i + "단 ");
            for(int j=1; j<10; j++){
                System.out.printf("%d * %d = %d\t", i, j, i*j);
            }
            System.out.println();
//            System.out.println("\n=============================================================================================================");
        }
    }
}
