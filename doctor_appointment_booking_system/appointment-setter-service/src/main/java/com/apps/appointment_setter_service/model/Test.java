package com.apps.appointment_setter_service.model;

public class Test {

    private String testName;
    private String testDate;
    private String testReport;

    public Test(String name, String date, String report){
        this.testName = name;
        this.testDate = date;
        this.testReport = report;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestDate() {
        return testDate;
    }

    public String getTestReport() {
        return testReport;
    }
}
