package com.apps.appointment_setter_service.resource;

import com.apps.appointment_setter_service.helper.AppointmentSetterHelper;
import com.apps.appointment_setter_service.model.Appointment;
import com.apps.appointment_setter_service.model.QueueResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/scheduler/v1")
public class AppointmentSetterResource {

    private AppointmentSetterHelper helper;

    @Autowired
    public AppointmentSetterResource(AppointmentSetterHelper helper){
        this.helper = helper;
    }

    @PostMapping("/appointment")
    public ResponseEntity setAppointment(@RequestBody Appointment appointment){
        QueueResponse res = helper.setAppointment(appointment);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @PostMapping("/ping")
    public ResponseEntity ping(@RequestBody Appointment appointment){
        return new ResponseEntity(helper.ping(appointment), HttpStatus.OK);
    }
}
