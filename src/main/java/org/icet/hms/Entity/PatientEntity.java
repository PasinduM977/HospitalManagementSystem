package org.icet.hms.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.yaml.snakeyaml.events.Event;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String contact;
    private String note;
    private String age;
    private String allergies;
    private String NIC;
    private String gender;
    private String bloodGroup;
    private String category;

}
