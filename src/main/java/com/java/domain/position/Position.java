package com.java.domain.position;

import com.java.dto.PositionDto;

public class Position {
    private Integer position;

    private Position(){
        this.position = 0;
    }
    public static Position of(){
        return new Position();
    }

    public void plusPosition(){
        this.position++;
    }

    public PositionDto carPositionDto(){
        return new PositionDto(this.position);
    }

}
