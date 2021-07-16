package com.example.demo.himart.controller;

import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HimartController extends LambdaUtils {
    private Scanner scanner;
    private PhoneApp phone;

    public HimartController() {
        phone = new PhoneApp();
    }

    public void main() {
        scanner = new Scanner(System.in);
        while (true) {
            print.accept("[Menu] 0-종료 1-스마트폰 2- 3- \n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1": phoneMain(scanner); break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
            }

        }
    }

    public void phoneMain(Scanner scanner){
        PhoneApp phoneApp = new PhoneApp();
        PhoneApp.Phone phone;
        PhoneApp.CellPhone cellPhone;
        PhoneApp.IPhone iPhone;
        PhoneApp.GalaxyNote galaxyNote;
        while (true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    phone = phoneApp.new Phone();
                    phone.setKind("집전화");
                    phone.setCompany("비트");
                    phone.setCall("집에서 전화중...");
                    println.accept(phone.toString());
                break;
                case "2":
                    cellPhone = phoneApp.new CellPhone();
                    cellPhone.setKind("초콜릿폰");
                    cellPhone.setCompany("비트");
                    cellPhone.setCall("이동하면서 전화중...");
                    cellPhone.setMove("이동");
                    println.accept(cellPhone.toString());
                    break;
                case "3":
                    iPhone = phoneApp.new IPhone();
                    iPhone.setKind(iPhone.getKind());
                    iPhone.setCompany("애플");
                    iPhone.setCall("아이폰으로 전화 중");
                    iPhone.setMove("이동");
                    iPhone.setInternet("구글에 접속하다.");
                    iPhone.isPortable();
                    println.accept(iPhone.toString());
                    break;
                case "4":
                    galaxyNote = phoneApp.new GalaxyNote();
                    galaxyNote.setInternet("구글에 접속하다.");
                    galaxyNote.setKind(galaxyNote.getKind());
                    galaxyNote.setCompany("삼성");
                    galaxyNote.setCall("갤럭시 노트로 전화 중");
                    galaxyNote.setMove("이동");
                    galaxyNote.isPortable();
                    galaxyNote.setInternet("네이버에 접속하다.");
                    galaxyNote.setPencil("갤럭시펜");
                    println.accept(galaxyNote.toString());
                    break;
            }
        }
    }
}