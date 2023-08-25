package allianz.healthtourism.service;

import allianz.healthtourism.base.BaseService;
import allianz.healthtourism.dto.Request.AppointmentRequest;
import allianz.healthtourism.dto.Request.DoctorRequest;
import allianz.healthtourism.dto.Response.AppointmentDTO;
import allianz.healthtourism.dto.Response.DoctorDTO;
import allianz.healthtourism.entity.Appointment;
import allianz.healthtourism.entity.Doctor;
import allianz.healthtourism.mapper.ModelMapperManager;
import allianz.healthtourism.repository.AppointmentRepository;
import allianz.healthtourism.repository.DoctorRepository;
import allianz.healthtourism.specification.AppointmentSpecification;
import allianz.healthtourism.specification.DoctorSpecification;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService extends BaseService<Appointment, AppointmentDTO, AppointmentRequest, AppointmentRepository, AppointmentSpecification> {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    AppointmentSpecification appointmentSpecification;


    public AppointmentService(ModelMapperManager modelMapperManager) {
        super(modelMapperManager);
    }

    @Override
    protected Class<Appointment> getEntity() {
        return Appointment.class;
    }

    @Override
    protected AppointmentRepository getRepository() {
        return appointmentRepository;
    }

    @Override
    protected AppointmentSpecification getSpecification() {
        return appointmentSpecification;
    }

    @Override
    protected Class<AppointmentDTO> getDto() {
        return AppointmentDTO.class;
    }

    @Override
    protected Class<AppointmentRequest> getRequestDto() {
        return AppointmentRequest.class;
    }
}
