package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

// add, subtract, multiple, divide, remain
public interface CalculatorService {
    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);
}
