package com.example.demo.dog.controller;

import com.example.demo.dog.domain.Dog;

import java.util.Scanner;

public class DogController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();
        System.out.println("개의 이름?");
        dog.setName(scanner.next());
        System.out.println("개의 색상?");
        dog.setColor(scanner.next());
        System.out.println("개의 품종?");
        dog.setBreed(scanner.next());
        System.out.println("개의 배고픔 상태?");
        dog.setHungry(scanner.nextBoolean());
        System.out.printf(dog.toString());
    }
}
