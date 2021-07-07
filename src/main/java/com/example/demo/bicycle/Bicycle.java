package com.example.demo.bicycle;

//  state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)
public class Bicycle {
    private int currentGear, pedalCadence;
    private double speed;

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    public int getCurrentGear() {
        return currentGear;
    }
    public void setPedalCadence(int pedalCadence) {
        this.pedalCadence = pedalCadence;
    }
    public int getPedalCadence() {
        return pedalCadence;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("현재 기어: %d단, 분당 페달횟수: %d회, 현재 속도: %5.2fkm/h", currentGear, pedalCadence, speed);
    }
}
