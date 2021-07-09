package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }


    @Override
    public int[] sequence(CalculatorDTO calculator) {
        int[] arr = new int[calculator.getNum2()-calculator.getNum1()+1];
        for (int i=0, j=calculator.getNum1(); j <= calculator.getNum2(); i++, j++){
            arr[i] = j;
        }
        return arr;
    }

    @Override
    public int[] sequence2(CalculatorDTO calculator) {
        int[] arr = new int[10];
        int i = 0;
        for (int j=1; j <= 10; j++){
            arr[i] = j;
            i++;
//            System.out.print(i + "\t"); // \t : 탭
        }
        return arr;
    }
}
