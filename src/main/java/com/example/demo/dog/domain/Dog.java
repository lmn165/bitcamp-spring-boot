package com.example.demo.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

public class Dog{
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

