package com.java.service.racing;

import com.java.domain.RacingManager;
import com.java.domain.car.Car;
import com.java.domain.view.Retries;

import java.util.List;

public interface RacingService {

    public RacingManager racingInitializer(List<Car> cars, Retries retries);
    public void advanceRound(RacingManager racingManager, Car car);
    public void advanceRound(RacingManager racingManager);
    public void tryMoveCarWithRandomChance(RacingManager racingManager, Car car);
    public void executeAllRounds(RacingManager racingManager);
}
