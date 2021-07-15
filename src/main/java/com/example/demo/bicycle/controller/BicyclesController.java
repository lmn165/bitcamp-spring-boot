package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BicyclesController extends LambdaUtils {
    // 자전거 등록, 목록 출력
    private BicycleDTO bicycle;
    private BicycleService bicycleService;
    public BicyclesController(){
        bicycleService = new BicycleServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("[메뉴] 0.종료 1.자전거 등록 2.카운트 3.전체 조회\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    bicycle = new BicycleDTO();
                    print.accept("현재 기어 단계: \n");
                    bicycle.setCurrentGear(scanner.nextInt());
                    print.accept("분당 페달수: \n");
                    bicycle.setPedalCadence(scanner.nextInt());
                    print.accept("현재 속도: \n");
                    bicycle.setSpeed(scanner.nextDouble());
                    bicycleService.addBicycles(bicycle);
                    break;
                case "2": print.accept(String.format("현재 자전거의 갯수는 총 %d대 입니다.\n", bicycleService.countBicycles())); break;
                case "3": showBicycles(); break;
            }
        }
    }

    public void showBicycles() {
        List<BicycleDTO> list = (List<BicycleDTO>) bicycleService.showBicycles();
        for (BicycleDTO bicycle : list){
            print.accept(string.apply(bicycle)+"\n");
        }
    }
}
