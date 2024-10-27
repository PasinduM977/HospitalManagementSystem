package org.icet.hms.repository;

import org.icet.hms.Entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface patientrepository extends CrudRepository<PatientEntity,Integer> {


    List<PatientEntity> findByname(String name);

    List<PatientEntity> findByaddress(String address);

    List<PatientEntity> findByNIC(String nic);

    List<PatientEntity> findBybloodGroup(String bloodGroup);

    List<PatientEntity> findBycontact(String contact);

    List<PatientEntity> findBycategory(String category);


}
