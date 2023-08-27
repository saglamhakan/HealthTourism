package allianz.healthtourism.dto.Request;

import allianz.healthtourism.base.BaseRequestDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class HotelRequest extends BaseRequestDTO {

    private String name;
    private String location;

    private boolean isConfirmed;  // Rezervasyon onay durumu

    private boolean isInvalid;  // Rezervasyon geçerlilik durumu

    private LocalDateTime createdAt = LocalDateTime.now();
}
