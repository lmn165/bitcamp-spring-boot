package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class DogServiceImpl implements DogService{
    private DogDTO dog;
    private final List<DogDTO> dogs;

    public DogServiceImpl(){
        dog = new DogDTO();
        dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public List<?> show() {
        return dogs;
    }

    @Override
    public int count() {
        return dogs.size();
    }

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
