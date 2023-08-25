package allianz.healthtourism.dto.Request;

import allianz.healthtourism.base.BaseRequestDTO;
import allianz.healthtourism.dto.Response.AppointmentDTO;
import allianz.healthtourism.entity.Appointment;
import lombok.Data;

import java.util.List;


@Data
public class DoctorRequest extends BaseRequestDTO {

    private String name;

    private String branch;

    private List<AppointmentDTO> appointments;


}
