package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{
    private final ArrayList<BicycleDTO> bicycles = new ArrayList<>();

    @Override
    public void addBicycles(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public List<?> showBicycles() {
//        System.out.println(bicycles);
        return bicycles;
    }

    @Override
    public int countBicycles() {
        return bicycles.size();
    }

    @Override
    public void changingGear(int gear) {

    }

    @Override
    public void changingPedalCadence(int pedal) {

    }

    @Override
    public void applyingBrakes(Boolean flag) {

    }
}
