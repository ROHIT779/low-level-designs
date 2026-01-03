package com.apps.appointment_setter_service.model;

public class Appointment {

    private String appointmentId;
    private Patient patientInfo;
    private String doctorId;

    public Appointment(){}

    public Appointment(Patient patient, String doctorId){
        this.patientInfo = patient;
        this.doctorId = doctorId;
        this.appointmentId = "";
    }

    public Patient getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(Patient patientInfo) {
        this.patientInfo = patientInfo;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setAppointmentId(String appointmentId){
        this.appointmentId = appointmentId;
    }

    public String getAppointmentId(){
        return appointmentId;
    }
}
