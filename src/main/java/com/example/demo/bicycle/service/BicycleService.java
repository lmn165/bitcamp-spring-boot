package com.example.demo.bicycle.service;

// changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
    void changingGear(int gear);
    void changingPedalCadence(int pedal);
    void applyingBrakes(Boolean flag);
}
