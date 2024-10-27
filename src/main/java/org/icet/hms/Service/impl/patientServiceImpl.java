package org.icet.hms.Service.impl;

import org.icet.hms.DTO.Patient;
import org.icet.hms.Entity.PatientEntity;
import org.icet.hms.Service.patientService;
import org.icet.hms.repository.patientrepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service

public class patientServiceImpl implements patientService {

  @Autowired
    patientrepository PS;


   @Autowired
    ModelMapper mapper;

    @Override
    public Patient getPatient() {
        //List<Patient> patientList=new ArrayList<>()
        return new Patient("pasindu","matara","0714248225","ABC","27","No","972641650V","Male","A+","ABC");
    }

    @Override
    public Map<String, String> postPatient(Patient p) {
        PS.save(mapper.map(p,PatientEntity.class));
        return null;
    }

    @Override
    public void deletePatient(int id) {
        PS.deleteById(id);
    }

    @Override
    public List<Patient> searchByName(String name) {

        List<Patient> patientList=new ArrayList<>();

        PS.findByname(name).forEach(p->
        patientList.add(mapper.map(p,Patient.class))

        );

        return patientList;
    }

    @Override
    public List<Patient> searchByAddress(String address) {
        List<Patient> patientList=new ArrayList<>();

        PS.findByaddress(address).forEach(p->
                patientList.add(mapper.map(p,Patient.class))

        );

        return patientList;
    }

    @Override
    public List<Patient> searchByNIC(String nic) {
        List<Patient> patientList=new ArrayList<>();

        PS.findByNIC(nic).forEach(p->
                patientList.add(mapper.map(p,Patient.class))

        );

        return patientList;
    }

    @Override
    public List<Patient> searchBybloodGroup(String bloodGroup) {
        List<Patient> patientList=new ArrayList<>();

        PS.findBybloodGroup(bloodGroup).forEach(p->
                patientList.add(mapper.map(p,Patient.class))

        );

        return patientList;
    }

    @Override
    public List<Patient> searchBycontact(String contact) {
        List<Patient> patientList=new ArrayList<>();

        PS.findBycontact(contact).forEach(p->
                patientList.add(mapper.map(p,Patient.class))

        );

        return patientList;
    }

    @Override
    public List<Patient> searchBycategory(String category) {
        List<Patient> patientList=new ArrayList<>();

        PS.findBycategory(category).forEach(p->
                patientList.add(mapper.map(p,Patient.class))

        );

        return patientList;
    }
}
