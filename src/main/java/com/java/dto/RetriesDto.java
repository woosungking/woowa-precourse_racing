package com.java.dto;

public class RetriesDto {
    private Integer retries;
    private RetriesDto(Integer retries){
        this.retries = retries;
    }
    public static RetriesDto of(Integer retries){
        return new RetriesDto(retries);

    }
    public Integer getRetries(){
        return this.retries;
    }
}
