package com.java.domain.view;

import com.java.dto.RetriesDto;

public class Retries {
    private Integer retries;
    private Retries(Integer retries){
        this.retries = retries;
    }
    public static Retries of(Integer retries){
        return new Retries(retries);
    }

    public void reduceRetries(){
        this.retries--;
    }
    public RetriesDto getRetriesDto(){
        return RetriesDto.of(this.retries);
    }
}
