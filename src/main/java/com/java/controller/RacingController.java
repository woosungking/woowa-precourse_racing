package com.java.controller;

import com.java.dto.view.StartRacingDto;
import com.java.service.RacingFacade;
import com.java.view.InputView;

public class RacingController {
    private final InputView inputView;
    private final RacingFacade racingFacade;

    public RacingController(InputView inputView, RacingFacade racingFacade) {
        this.inputView = inputView;
        this.racingFacade = racingFacade;
    }

    public void racing(){
        StartRacingDto startRacingDto = inputView.startRacingView();
        racingFacade.startRacing(startRacingDto);
    }
}
