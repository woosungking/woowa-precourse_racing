package com.java.domain.racing;

import com.java.domain.Car;
import com.java.domain.CarList;
import com.java.domain.position.CarPosition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingTrack {
    private Map<Car, CarPosition> racing;
    private RacingTrack(){
        racing = new HashMap<>();
    }
    public RacingTrack of(List<Car> carList){
        RacingTrack racingTrack = new RacingTrack();
        for(Car car : carList){
            racingTrack.addRacingTrack(car,CarPosition.of());
        }
        return new RacingTrack();
    }
    public void addRacingTrack(Car car, CarPosition carPosition){
        racing.put(car,carPosition);
    }

    public void moveCar(Car car){
        CarPosition carPosition = racing.get(car);
        carPosition.plusPosition();
    }

}
