package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import allianz.healthtourism.entity.Appointment;
import lombok.Data;

import java.util.List;

@Data
public class PatientDTO extends BaseDTO {

    private String name;

    private List<AppointmentDTO> appointments;
}
