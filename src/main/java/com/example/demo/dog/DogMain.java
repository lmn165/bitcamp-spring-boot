package com.example.demo.dog;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

class Dog{
    private String name, color, breed;
    private boolean hungry;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setHungry(Boolean hungry){
        this.hungry = hungry;
    }
    public boolean getHungry(){
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", name, color, breed, hungry?"배고픔":"배부름");
    }
}

public class DogMain {
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
