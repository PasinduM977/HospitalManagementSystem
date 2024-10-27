package org.icet.hms.Service;

import org.icet.hms.DTO.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface patientService {

    Patient getPatient();

    Map<String, String> postPatient(Patient p);

    void deletePatient(int id);

    List<Patient> searchByName(String name);

    List<Patient> searchByAddress(String address);

    List<Patient> searchByNIC(String NIC);

    List<Patient> searchBybloodGroup(String bloodGroup);

    List<Patient> searchBycontact(String contact);

    List<Patient> searchBycategory(String category);
}
