package org.icet.hms.repository;

import org.icet.hms.Entity.appointmentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface appointmentRepository extends CrudRepository<appointmentEntity, Integer> {

    List<appointmentEntity> findByadminID(Integer id);

    List<appointmentEntity> findBypatientID(Integer id);

    List<appointmentEntity> findBytype(String type);
}
