package com.java.domain.racing;

import com.java.domain.car.Car;
import com.java.domain.position.Position;
import com.java.dto.CarDto;
import com.java.dto.CarPositionDto;
import com.java.dto.PositionDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingTrack {
    private Map<Car, Position> racing;

    private RacingTrack(){
        racing = new HashMap<>();
    }
    public static RacingTrack of(List<Car> carList){
        RacingTrack racingTrack = new RacingTrack();
        for(Car car : carList){
            racingTrack.addRacingTrack(car, Position.of());
        }
        return racingTrack;
    }
    public void addRacingTrack(Car car, Position position){
        racing.put(car, position);
    }

    public void moveCar(Car car){
        racing.get(car).plusPosition();
    }

    public Integer size(){
        return racing.size();
    }

    public CarPositionDto getCarPositionDTO(Car car){
        CarDto carDto = car.carDto();
        PositionDto positionDto = racing.get(car).carPositionDto();
        return CarPositionDto.of(carDto.getCarName(), positionDto.getPosition());
    }

    public List<Car> getAllCars(){
        return new ArrayList<>(racing.keySet());
    }

}
