package com.java.service;

import com.java.domain.RacingManager;
import com.java.domain.car.Car;
import com.java.domain.car.CarList;
import com.java.domain.racing.RacingTrack;
import com.java.domain.view.Retries;
import com.java.dto.view.StartRacingDto;
import com.java.service.car.CarService;

import java.util.List;

public class RacingFacadeImpl implements RacingFacade{
    private final CarService carService;

    public RacingFacadeImpl(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void startRacing(StartRacingDto startRacingDto) {

//        String carNames=startRacingDto.getCarNames();
//        Integer retries = startRacingDto.getRetries();
//
//        List<Car> cars = carService.splitCarNamesToCarList(carNames);
//        CarList carList = CarList.of(cars); //여 까지는 초기 세팅.
//
//        List<Car> cars1 = carService.getAllCarInCarList(carList);
//        RacingTrack racingTrack = RacingTrack.of(cars1); // 레이싱 트렉에 자동차랑, 위치선정,
//
//        RacingManager racingManager = RacingManager.of(racingTrack, Retries.of(retries));
//
//
//        racingManager.reduceRetries();
//        racingManager.moveCarInTrack(carList.findCarByName("k5"));
    }
}
