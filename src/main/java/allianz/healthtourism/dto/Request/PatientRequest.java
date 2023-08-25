package allianz.healthtourism.dto.Request;

import allianz.healthtourism.base.BaseRequestDTO;
import allianz.healthtourism.dto.Response.AppointmentDTO;
import allianz.healthtourism.entity.Appointment;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class PatientRequest extends BaseRequestDTO {

    private String name;

    private List<AppointmentDTO> appointments;
}
