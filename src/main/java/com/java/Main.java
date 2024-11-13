package com.java;

import com.java.service.RacingFacade;
import com.java.service.RacingFacadeImpl;
import com.java.service.car.CarService;
import com.java.service.car.CarServiceImpl;
import com.java.view.InputView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarService carService = new CarServiceImpl();
        RacingFacade racingFacade = new RacingFacadeImpl(carService);
    }
}