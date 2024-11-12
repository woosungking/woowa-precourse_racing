package com.java.dto;

public class CarPositionDto {
    private final String carName;
    private final Integer carPosition;
    private CarPositionDto(String carName, Integer carPosition){
        this.carName = carName;
        this.carPosition = carPosition;
    }
    public static CarPositionDto of(String carName, Integer carPosition){
        return new CarPositionDto(carName, carPosition);
    }
    public Integer getCarPosition(){
        return this.carPosition;
    }
    public String getCarName(){
        return this.carName;
    }
}
