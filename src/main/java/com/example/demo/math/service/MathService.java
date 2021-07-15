package com.example.demo.math.service;

import com.example.demo.math.domain.MathDTO;

// add, subtract, multiple, divide, remain
public interface MathService {
    int add(MathDTO calculator);
    int subtract(MathDTO calculator);
    int multiple(MathDTO calculator);
    int divide(MathDTO calculator);
    int remain(MathDTO calculator);
    int[] sequence(MathDTO calculator);
    int[] sequence2(MathDTO calculator);
}
