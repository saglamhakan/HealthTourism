package allianz.healthtourism.dto.Request;

import allianz.healthtourism.base.BaseRequestDTO;
import allianz.healthtourism.dto.Response.DoctorDTO;
import allianz.healthtourism.dto.Response.HealthServiceDTO;
import allianz.healthtourism.dto.Response.PatientDTO;
import allianz.healthtourism.entity.Doctor;
import allianz.healthtourism.entity.HealthService;
import allianz.healthtourism.entity.Patient;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class AppointmentRequest extends BaseRequestDTO {

    private PatientDTO patient;

    private DoctorDTO doctor;

    private HealthServiceDTO healthService;
}
