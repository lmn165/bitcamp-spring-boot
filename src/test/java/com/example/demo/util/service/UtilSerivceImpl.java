package com.example.demo.util.service;

public class UtilSerivceImpl {
    public static void main(String[] args) {
        String result = "";
        for (int i=0; i<4; i++){
            result += (int)(Math.random()*10);
        }
        System.out.println(result);
    }
}
