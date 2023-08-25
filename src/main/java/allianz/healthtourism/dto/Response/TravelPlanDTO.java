package allianz.healthtourism.dto.Response;

import allianz.healthtourism.base.BaseDTO;
import allianz.healthtourism.entity.Appointment;
import allianz.healthtourism.entity.Flight;
import allianz.healthtourism.entity.Hotel;
import lombok.Data;

@Data
public class TravelPlanDTO extends BaseDTO {

    private AppointmentDTO appointment;

    private HotelDTO hotel;

    private FlightDTO flight;
}
