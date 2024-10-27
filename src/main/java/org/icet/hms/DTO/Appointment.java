package org.icet.hms.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

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
