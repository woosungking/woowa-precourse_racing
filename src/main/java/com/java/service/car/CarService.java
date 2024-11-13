package com.java.service.car;

import com.java.domain.car.Car;
import com.java.domain.car.CarList;

import java.util.List;

public interface CarService {
    public List<Car> splitCarNamesToCarList(String carNames);
    public void addCarToCarList(List<Car> cars, CarList carList);
    public List<Car> getAllCarInCarList(CarList carList);
}
