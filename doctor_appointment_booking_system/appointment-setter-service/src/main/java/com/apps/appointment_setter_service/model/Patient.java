package com.apps.appointment_setter_service.model;

public class Patient {

    private String patientId;
    private String patientName;
    private String patientContact;
    private Condition patientCondition;

    public Patient(String id, String name, String contact, Condition condition){
        this.patientId = id;
        this.patientName = name;
        this.patientContact = contact;
        this.patientCondition = condition;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public Condition getPatientCondition() {
        return patientCondition;
    }
}
