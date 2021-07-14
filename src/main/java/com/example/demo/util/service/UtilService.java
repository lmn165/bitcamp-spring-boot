package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface UtilService {
    LocalDate today();
    LocalTime currentTime();
    String todayAndCurrentTime();
    // 자릿수를 입력받아 랜덤난수 생성
    String randomNumbers(int digits);
}
