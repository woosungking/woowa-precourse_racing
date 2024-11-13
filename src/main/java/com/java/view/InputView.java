package com.java.view;

import camp.nextstep.edu.missionutils.Console;
import com.java.dto.view.StartRacingDto;

public class InputView {

    public StartRacingDto startRacingView(){
        System.out.println(InputMessage.ENTER_CAR_NAMES);
        String carNames = Console.readLine();
        System.out.println(InputMessage.ENTER_RETRIES_NUMBER);
        Integer retries = Integer.valueOf(Console.readLine());
        return StartRacingDto.of(carNames, retries);
    }
}
