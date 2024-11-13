package com.java.view;

public enum InputMessage {
    ENTER_CAR_NAMES("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)"),
    ENTER_RETRIES_NUMBER("시도 할 횟수");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }
}
