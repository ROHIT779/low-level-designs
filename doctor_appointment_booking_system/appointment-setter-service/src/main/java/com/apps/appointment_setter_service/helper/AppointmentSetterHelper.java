package com.apps.appointment_setter_service.helper;

import com.apps.appointment_setter_service.model.Appointment;
import com.apps.appointment_setter_service.model.QueueResponse;
import com.apps.appointment_setter_service.service.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AppointmentSetterHelper {

    @Autowired
    private RestTemplate restTemplate;

    public AppointmentSetterHelper(){}

    public QueueResponse setAppointment(Appointment appointment){
        appointment.setAppointmentId(IdGenerator.generateId(appointment));
        QueueResponse response = restTemplate.postForObject("http://localhost:8081/service/scheduler/v1/ping", appointment, QueueResponse.class);
        return response;
    }

    public QueueResponse ping(Appointment appointment){
        return new QueueResponse("pong: Appointment(id=" + appointment.getAppointmentId() + ") is added to doctor's queue, doctor_id=" + appointment.getDoctorId());
    }
}
