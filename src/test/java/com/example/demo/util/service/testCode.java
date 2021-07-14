package com.example.demo.util.service;

public class testCode {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse();
    }
}

class Mouse {
    int btnCounter;
    String color;

    public void leftClick(){
        System.out.println("왼쪽 버튼이 눌렸습니다.");
    }
}