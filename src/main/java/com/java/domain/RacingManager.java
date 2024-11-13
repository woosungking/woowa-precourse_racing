package com.java.domain;

import com.java.domain.car.Car;
import com.java.domain.racing.RacingTrack;
import com.java.domain.view.Retries;
import com.java.dto.CarPositionDto;
import com.java.dto.RetriesDto;

public class RacingManager {
    private RacingTrack racingTrack;
    private Retries retries;
    private RacingManager(RacingTrack racingTrack, Retries retries){
        this.racingTrack = racingTrack;
        this.retries = retries;
    }
    public static RacingManager of(RacingTrack racingTrack, Retries retries){
        return new RacingManager(racingTrack, retries);
    }

    public void moveCarInTrack(Car car){
        this.racingTrack.moveCar(car);
    }
    public void reduceRetries(){
        this.retries.reduceRetries();
    }

    public CarPositionDto getCarPositionDto(Car car){
        return racingTrack.getCarPositionDTO(car);
    }

    public RetriesDto getRetriesDto(){
        return this.retries.getRetriesDto();
    }

}
