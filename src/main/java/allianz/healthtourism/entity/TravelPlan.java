package allianz.healthtourism.entity;

import allianz.healthtourism.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class TravelPlan extends BaseEntity {

    @OneToOne
    private Appointment appointment;

    @OneToOne
    private Hotel hotel;

    @OneToOne
    private Flight flight;

}
