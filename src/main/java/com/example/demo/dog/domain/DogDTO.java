package com.example.demo.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import lombok.Data;

import java.util.Scanner;

@Data
public class DogDTO {
    private String name, color, breed;

    @Override
    public String toString() {
        return String.format("이름은 %s이고, 색깔은 %s이고, 품종은 %s입니다.", name, color, breed);
    }
}

