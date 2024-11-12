package com.java.dto;

public class CarDto {
    private final String carName;
    public CarDto(String carName){
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
