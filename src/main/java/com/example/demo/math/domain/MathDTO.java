package com.example.demo.math.domain;

import lombok.Data;

@Data
public class MathDTO {
    private int num1, num2;
    private String opcode;

    @Override
    public String toString() {
        return String.format("%d + %d = %d", num1, num2, num1+num2);
    }
}
