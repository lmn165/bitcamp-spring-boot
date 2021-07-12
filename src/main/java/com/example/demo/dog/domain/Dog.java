package com.example.demo.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import lombok.Data;

import java.util.Scanner;

@Data
public class Dog{
    private String name, color, breed;
    private boolean hungry;

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", name, color, breed, hungry?"배고픔":"배부름");
    }
}

