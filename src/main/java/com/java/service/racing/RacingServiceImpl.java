package com.java.service.racing;

import camp.nextstep.edu.missionutils.Randoms;
import com.java.domain.RacingManager;
import com.java.domain.car.Car;
import com.java.domain.car.CarList;
import com.java.domain.racing.RacingTrack;
import com.java.domain.view.Retries;

import java.util.List;

public class RacingServiceImpl implements RacingService{
    @Override
    public RacingManager racingInitializer(List<Car> cars, Retries retries) {
        RacingTrack racingTrack = RacingTrack.of(cars); // 레이싱 트렉에 자동차랑, 위치선정,
        return RacingManager.of(racingTrack, retries);
    }
    @Override
    public void advanceRound(RacingManager racingManager) {
        racingManager.reduceRetries();
    }
    @Override
    public void advanceRound(RacingManager racingManager, Car car) {
        racingManager.moveCarInTrack(car);
        racingManager.reduceRetries();
    }
    @Override
    public void tryMoveCarWithRandomChance(RacingManager racingManager, Car car){
        int number = Randoms.pickNumberInRange(1, 9);
        if(number>4){
            advanceRound(racingManager,car);
            return;
        }
        advanceRound(racingManager);
    }
    @Override
    public void executeAllRounds(RacingManager racingManager) {
        List<Car> carList = racingManager.getAllCars();
        Integer retries = racingManager.getRetriesDto().getRetries();
        if (retries != 0) {
            for (Car car : carList) {
                tryMoveCarWithRandomChance(racingManager, car);
            }
            executeAllRounds(racingManager);
        }

    }
}
