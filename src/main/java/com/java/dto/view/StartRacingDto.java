package com.java.dto.view;

public class StartRacingDto {
    private String carNames;
    private Integer retries;
    private StartRacingDto(String carNames, Integer retries){
        this.carNames = carNames;
        this.retries = retries;
    }
    public static StartRacingDto of(String carNames, Integer retries){
        return new StartRacingDto(carNames,retries);
    }
}
