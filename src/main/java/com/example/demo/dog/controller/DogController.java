package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;

@Controller
//@RequiredArgsConstructor
//@NoArgsConstructor
public class DogController{

    private final DogService dogService;
//    private final ArrayList<DogDTO> dogs;

    public DogController(){
        dogService = new DogServiceImpl();
//        dogs = new ArrayList<>();
    }

    public void add(DogDTO dog) {
        dogService.add(dog);
    }

    public void show() {
        System.out.println("강아지의 수 : " + dogService.count());
        System.out.println(dogService.show());
    }

    public int count() {
        return dogService.count();
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }

    public String fetching(String target) {
        return dogService.fetching(target);
    }

    public String waggingTail() {
        return dogService.waggingTail();
    }

}
