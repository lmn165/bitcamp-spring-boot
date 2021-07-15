package com.example.demo.math.controller;

import com.example.demo.util.service.LambdaUtils;

public class SumController extends LambdaUtils {

    public void sum(){
        int i=0;
        int result=0;
        // 1부터 10까지의 합 구하기
        // while문을 이용한 합
        while(i<100){
            result += ++i;
        }
        print.accept("while문을 이용한 1~10까지의 합: " + result);

        // for문을 이용한 합
        for(i=0, result=0; i<100; i++){
            result += (i+1);
        }
        print.accept("for문을 이용한 1~10까지의 합: " + result);
    }

}
