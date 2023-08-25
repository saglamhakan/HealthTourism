package allianz.healthtourism.dto.Request;

import allianz.healthtourism.base.BaseRequestDTO;
import allianz.healthtourism.dto.Response.AppointmentDTO;
import lombok.Data;

import java.util.List;

@Data
public class HealthServiceRequest extends BaseRequestDTO {

    private String serviceName;

    private List<AppointmentDTO> appointments;
}
