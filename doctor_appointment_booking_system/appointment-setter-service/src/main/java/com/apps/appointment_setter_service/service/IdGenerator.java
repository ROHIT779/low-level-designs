package com.apps.appointment_setter_service.service;

public class IdGenerator {

    public static <T> String generateId(T t){
        return Integer.toString(t.hashCode());
    }
}
