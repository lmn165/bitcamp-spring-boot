package com.example.demo.bicycle.domain;

import lombok.Data;

//  state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes)
@Data
public class BicycleDTO {
    private int currentGear, pedalCadence;
    private double speed;

    @Override
    public String toString() {
        return String.format("현재 기어: %d단, 분당 페달횟수: %d회, 현재 속도: %5.2fkm/h", currentGear, pedalCadence, speed);
    }
}
