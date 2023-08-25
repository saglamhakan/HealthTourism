package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class DoctorDTO extends BaseDTO {

    private String name;

    private String branch;

    private List<AppointmentDTO> appointments;

}
