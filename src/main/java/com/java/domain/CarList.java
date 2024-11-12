package com.java.domain;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> carList;
    private CarList(){
        carList = new ArrayList<>();
    }
    private CarList(List<Car> cars){
        carList = new ArrayList<>();
        carList.addAll(cars);
    }
    public static CarList of(List<Car> cars){
        return new CarList(cars);
    }
    public void addCar(Car car){
        carList.add(car);
    }
    public void addAllCar(List<Car> cars){
        carList.addAll(cars);
    }
    public Integer size(){
        return carList.size();
    }
}
