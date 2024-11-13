package com.java.service.car;

import com.java.domain.car.Car;
import com.java.domain.car.CarList;

import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> splitCarNamesToCarList(String carNames) {
        return Arrays.stream(carNames.split(",")).map(Car::of).toList();
    }

    @Override
    public void addCarToCarList(List<Car> cars, CarList carList) {
        carList.addAllCar(cars);
    }

    @Override
    public List<Car> getAllCarInCarList(CarList carList) { //리스트는 방어적 복사지만, 안에 Car객체는 얕은 복사로 반환됨.
        return carList.findAllCar();
    }
}
