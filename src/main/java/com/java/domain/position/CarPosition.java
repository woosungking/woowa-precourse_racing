package com.java.domain.position;

import com.java.dto.CarPositionDto;

public class CarPosition {
    private Integer position;

    private CarPosition(){
        this.position = 0;
    }
    public static CarPosition of(){
        return new CarPosition();
    }

    public void goStraight(){
        this.position++;
    }

    public CarPositionDto carPositionDto(){
        return new CarPositionDto(this.position);
    }

}
