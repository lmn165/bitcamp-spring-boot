package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;

import java.util.List;

// barking, fetching, wagging tail
// 인터페이스는 기획을 할 때 사용한다.
public interface DogService {

    void add(DogDTO dog);
    List<?> show();
    int count();
    String barking(String bark);
    String fetching(String target);
    String waggingTail();
}
