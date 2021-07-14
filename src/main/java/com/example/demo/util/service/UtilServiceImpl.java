package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class UtilServiceImpl implements UtilService {
    // 주어진 자릿수 만큼의 랜덤난수를 생성하는 기능
    @Override
    public String randomNumbers(int digits) {
        // Math.random()    클래스 메소드
        // Random random = new Random();
        // random.nextInt(1000);
//        random = new Random();
        String randomNumber = "";
        for(int i=0; i<digits; i++){
            randomNumber += (int)(Math.random()*10);
        }

        return randomNumber;
    }
    // 아래 코드는 말이 안되는 코드이다. -> 클래스 변수로 인식되기 때문이다.
    // UtilDTO util = new UtilDTO();

    // 해결방법 1.확실히 클래스 변수의 형태를 취해준다.
    // public final static UtilDTO util = new UtilDTO();

    // 해결방법 2.인스턴스 변수로 선언을 한다. -> 인스턴스 변수의 초기화부가 필요하다.
    private UtilDTO util;

    // 생성자를 이용한 인스턴스 변수의 초기화
    // -->> 위의 초기화 예제들에서는 모든 객체가 하나의 UtilDTO를 바라보는 형태이지만,
    //      아래의 형태를 취하면 각 객체는 각각의 UtilDTO를 바라보는 형태가 된다.
    public UtilServiceImpl(){
        this.util = new UtilDTO();
    }

    @Override
    public LocalDate today() {
        util = new UtilDTO();
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s", today(), currentTime());
    }
}
