package com.java.service.car;

import com.java.domain.car.Car;

import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> splitCarNamesToCarList(String carNames) {
        return Arrays.stream(carNames.split(",")).map(Car::of).toList();
    }

    @Override
    public void addCarToCarList(List<Car> carList) {

    }
}
