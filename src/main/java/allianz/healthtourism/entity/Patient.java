package allianz.healthtourism.entity;

import allianz.healthtourism.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class Patient extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

}
