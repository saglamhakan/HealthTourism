package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import lombok.Data;

import java.util.UUID;

@Data
public class ExaminationDTO extends BaseDTO {

    private UUID appointmentUuid;

    private String notes;
}
