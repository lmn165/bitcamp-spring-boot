package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
//@RequiredArgsConstructor
//@NoArgsConstructor
public class DogController extends LambdaUtils {

    private final DogService dogService;

    public DogController(){
        dogService = new DogServiceImpl();
    }

    public void main(){
        DogDTO dog = new DogDTO();
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("[메뉴]: 0.종료 1.추가 2.카운트 3.목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    print.accept("이름이 무엇입니까?\n");
                    dog.setName(scanner.next());
                    print.accept("색깔은 무엇입니까?\n");
                    dog.setColor(scanner.next());
                    print.accept("품종은 무엇입니까?\n");
                    dog.setBreed(scanner.next());
                    add(dog);
                    break;
                case "2": print.accept(String.format("강아지의 수 : %d\n",  dogService.count())); break;
                case "3": show(); break;
            }
        }
    }

    public void add(DogDTO dog) {
        dogService.add(dog);
    }

    public void show() {
        List<DogDTO> list = (List<DogDTO>) dogService.show();
        for (DogDTO dog : list){
            print.accept(string.apply(dog)+"\n");
        }
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
