package com.java.domain.racing;

import com.java.domain.car.Car;
import com.java.domain.position.CarPosition;
import com.java.dto.CarDto;
import com.java.dto.CarPositionDto;
import com.java.dto.PositionDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingTrack {
    private Map<Car, CarPosition> racing;

    private RacingTrack(){
        racing = new HashMap<>();
    }
    public static RacingTrack of(List<Car> carList){
        RacingTrack racingTrack = new RacingTrack();
        for(Car car : carList){
            racingTrack.addRacingTrack(car,CarPosition.of());
        }
        return racingTrack;
    }
    public void addRacingTrack(Car car, CarPosition carPosition){
        racing.put(car,carPosition);
    }

    public void moveCar(Car car){
        CarPosition carPosition = racing.get(car);
        carPosition.plusPosition();
    }

    public Integer size(){
        return racing.size();
    }

    public CarPositionDto getCarPositionDTO(Car car){
        CarDto carDto = car.carDto();
        PositionDto positionDto = racing.get(car).carPositionDto();
        return CarPositionDto.of(carDto.getCarName(), positionDto.getPosition());
    }

}
