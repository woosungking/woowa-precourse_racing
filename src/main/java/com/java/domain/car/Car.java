package com.java.domain.car;

import com.java.dto.CarDto;

public class Car {
    private String carName;
    private Car(String carName){
        this.carName = carName;
    }
    public static Car of(String carName){
        return new Car(carName);
    }

    public CarDto carDto(){
        return new CarDto(this.carName);
    }
}
