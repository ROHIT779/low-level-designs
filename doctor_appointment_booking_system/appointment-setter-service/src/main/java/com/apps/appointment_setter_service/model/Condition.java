package com.apps.appointment_setter_service.model;

import java.util.List;
import java.util.Set;

public class Condition {

    private Set<Symptom> symptoms;
    private List<Test> tests;

    public Condition(Set<Symptom> symptoms, List<Test> tests){
        this.symptoms = symptoms;
        this.tests = tests;
    }

    public Set<Symptom> getSymptoms() {
        return symptoms;
    }

    public List<Test> getTests() {
        return tests;
    }
}
