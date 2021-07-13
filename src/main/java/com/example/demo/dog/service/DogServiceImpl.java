package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DogServiceImpl implements DogService{
    private final DogDTO dog;

    @Override
    public String barking(String bark) {
        return dog.toString() + bark + " 짖는다.";
    }

    @Override
    public String fetching(String target) {
        return dog.toString() + target + "을(를) 물어온다.";
    }

    @Override
    public String waggingTail() {
        return "꼬리를 흔든다.";
    }
}
