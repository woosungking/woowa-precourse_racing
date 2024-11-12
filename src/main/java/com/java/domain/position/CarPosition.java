package com.java.domain.position;

import com.java.dto.PositionDto;

public class CarPosition {
    private Integer position;

    private CarPosition(){
        this.position = 0;
    }
    public static CarPosition of(){
        return new CarPosition();
    }

    public void plusPosition(){
        this.position++;
    }

    public PositionDto carPositionDto(){
        return new PositionDto(this.position);
    }

}
