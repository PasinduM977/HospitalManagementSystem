package org.icet.hms.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class appointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String type;
    private LocalDateTime dateAndTime;
    private int patientID;
    private String description;
    private int roomNo;
    private String status;
    private int q_No;
    private String qr;
    private int adminID;
}
