package allianz.healthtourism.dto.Request;

import allianz.healthtourism.base.BaseRequestDTO;
import lombok.Data;

@Data
public class HotelRequest extends BaseRequestDTO {

    private String name;
    private String location;
}
