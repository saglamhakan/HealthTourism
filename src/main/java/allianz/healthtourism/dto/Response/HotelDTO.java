package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import lombok.Data;

@Data
public class HotelDTO extends BaseDTO {

    private String name;
    private String location;
}
