package allianz.healthtourism.entity;

import allianz.healthtourism.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class Doctor extends BaseEntity {

    private String name;

    private String branch;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
}
