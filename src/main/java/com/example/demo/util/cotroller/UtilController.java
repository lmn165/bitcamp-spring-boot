package com.example.demo.util.cotroller;

import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

public class UtilController {
    UtilService utilService = new UtilServiceImpl();

    public void todayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }
}
