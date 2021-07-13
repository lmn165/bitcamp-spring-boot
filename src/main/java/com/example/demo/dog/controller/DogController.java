package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class DogController implements DogService {

    private final DogService dogService;

    @Override
    public String barking(String bark) {
        return dogService.barking(bark);
    }

    @Override
    public String fetching(String target) {
        return dogService.fetching(target);
    }

    @Override
    public String waggingTail() {
        return dogService.waggingTail();
    }

}
