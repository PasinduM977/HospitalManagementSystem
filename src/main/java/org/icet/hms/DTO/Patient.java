package org.icet.hms.DTO;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {

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
