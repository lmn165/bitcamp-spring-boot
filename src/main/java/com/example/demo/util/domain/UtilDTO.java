package com.example.demo.util.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilDTO {
    private LocalDate today;
    private LocalTime currentTime;

    public void setToday(LocalDate today){
        this.today = today;
    }
    public LocalDate getToday(){
        return this.today;
    }
    public void setCurrentTime(LocalTime currentTime){
        this.currentTime = currentTime;
    }
    public LocalTime getCurrentTime() {
        return this.currentTime;
    }
}
