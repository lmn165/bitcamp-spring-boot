package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.ArrayList;

// changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
    void addBicycles(BicycleDTO bicycle);
    void showBicycles();
    int countBicycles();
    void changingGear(int gear);
    void changingPedalCadence(int pedal);
    void applyingBrakes(Boolean flag);
}
