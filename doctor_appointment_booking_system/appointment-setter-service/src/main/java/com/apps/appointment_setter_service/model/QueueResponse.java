package com.apps.appointment_setter_service.model;

public class QueueResponse {

    private String message;

    public QueueResponse(){}

    public QueueResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
