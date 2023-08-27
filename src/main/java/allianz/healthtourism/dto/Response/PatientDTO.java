package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import allianz.healthtourism.entity.Appointment;
import allianz.healthtourism.entity.Patient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PatientDTO extends BaseDTO {

    private String name;

    private Long doctorId;

    private Long appointmentId;


}
