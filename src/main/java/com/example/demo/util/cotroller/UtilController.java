package com.example.demo.util.cotroller;

import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

public class UtilController {
    private UtilService utilService;
    public UtilController(){
        utilService = new UtilServiceImpl();
    }
    public void todayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }
}
