package org.icet.hms.Controller;

import lombok.RequiredArgsConstructor;
import org.icet.hms.DTO.Patient;
import org.icet.hms.Service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class patientController {

    final private patientService patient;
    @GetMapping("/getPatient")
    public Patient getPatient()
    {
        return patient.getPatient();

    }

    @PostMapping("/postPatient")
    public Map<String, String> postpatient(@RequestBody Patient p)
    {
        patient.postPatient(p);
        return Collections.singletonMap("Status","Request Success");
    }

    @DeleteMapping("/delPatient/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public  void deletePatient(@PathVariable int id)
    {
        patient.deletePatient(id);
    }

    @PutMapping("/updatePatient")
    public Map<String, String> updatepatient(@RequestBody Patient p)
    {
        patient.postPatient(p);
        return Collections.singletonMap("Status","Request Success");
    }

    @PostMapping("/searchByNamePatient/{name}")
    public List<Patient> searchByNamePatient(@PathVariable String name)
    {

        return patient.searchByName(name);
    }

    @PostMapping("/searchByaddressPatient/{address}")
    public List<Patient> searchByAddressPatient(@PathVariable String address)
    {

        return patient.searchByAddress(address);
    }
//search by NIC
    @PostMapping("/searchByNICPatient/{NIC}")
    public List<Patient> searchByNICPatient(@PathVariable String NIC)
    {

        return patient.searchByNIC(NIC);
    }
    //search by Bgrp
    @PostMapping("/searchBybloodGroupPatient/{bloodGroup}")
    public List<Patient> searchBybloodGroupPatient(@PathVariable String bloodGroup)
    {

        return patient.searchBybloodGroup(bloodGroup);
    }
    //search by Contact
    @PostMapping("/searchBycontactPatient/{contact}")
    public List<Patient> searchBycontactPatient(@PathVariable String contact)
    {

        return patient.searchBycontact(contact);
    }
    //search by category
    @PostMapping("/searchBycategoryPatient/{category}")
    public List<Patient> searchBycategoryPatient(@PathVariable String category)
    {

        return patient.searchBycategory(category);
    }


}
