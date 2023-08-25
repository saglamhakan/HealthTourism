package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import allianz.healthtourism.entity.Doctor;
import allianz.healthtourism.entity.HealthService;
import allianz.healthtourism.entity.Patient;
import lombok.Data;

@Data
public class AppointmentDTO extends BaseDTO {

    private PatientDTO patient;

    private DoctorDTO doctor;

    private HealthServiceDTO healthService;
}
