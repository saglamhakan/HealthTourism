package allianz.healthtourism.controller;

import allianz.healthtourism.base.BaseController;
import allianz.healthtourism.dto.Request.AppointmentRequest;
import allianz.healthtourism.dto.Request.DoctorRequest;
import allianz.healthtourism.dto.Response.AppointmentDTO;
import allianz.healthtourism.dto.Response.DoctorDTO;
import allianz.healthtourism.entity.Appointment;
import allianz.healthtourism.entity.Doctor;
import allianz.healthtourism.repository.AppointmentRepository;
import allianz.healthtourism.repository.DoctorRepository;
import allianz.healthtourism.service.AppointmentService;
import allianz.healthtourism.service.DoctorService;
import allianz.healthtourism.specification.AppointmentSpecification;
import allianz.healthtourism.specification.DoctorSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appointment")
public class AppointmentController extends BaseController<
        Appointment,
        AppointmentDTO,
        AppointmentRequest,
        AppointmentRepository,
        AppointmentSpecification,
        AppointmentService> {


    @Autowired
    AppointmentService appointmentService;


    @Override
    protected AppointmentService getService() {
        return appointmentService;
    }
}
