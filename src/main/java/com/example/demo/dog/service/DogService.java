package com.example.demo.dog.service;

// barking, fetching, wagging tail
// 인터페이스는 기획을 할 때 사용한다.
public interface DogService {

    // 들어오고 나갈 속성이 없으므로 함수라고 볼 수 있다.
    String barking(String Bark);
    String fetching(String target);
    String waggingTail();
}
