package org.icet.hms.Service.impl;

import lombok.RequiredArgsConstructor;
import org.icet.hms.DTO.Appointment;
import org.icet.hms.Entity.appointmentEntity;
import org.icet.hms.Service.appointmentService;
import org.icet.hms.repository.appointmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class appointmentServiceImpl implements appointmentService {

    final appointmentRepository ar;

    final ModelMapper mapper;
    @Override
    public void addAppintment(Appointment appointment) {

        ar.save(mapper.map(appointment, appointmentEntity.class));
    }

    @Override
    public boolean deleteAppintment(Integer id) {
        ar.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> searchAppointment() {
        List<Appointment> appointmentList=new ArrayList<>();
        ar.findAll().forEach(entity->{
            appointmentList.add(mapper.map(entity,Appointment.class));
        });
        return appointmentList;
    }

    @Override
    public Appointment searchAppointmentByID(Integer id) {

      return  mapper.map(ar.findById(id),Appointment.class);

    }

    @Override
    public List<Appointment> searchAppointmentByAdminID(Integer id) {
        List<Appointment> appointmentList=new ArrayList<>();
        ar.findByadminID(id).forEach(entity->{
            appointmentList.add(mapper.map(entity, Appointment.class));
        });
        return appointmentList;
    }

    @Override
    public List<Appointment> searchAppointmentByPatientID(Integer id) {
        List<Appointment> appointmentList=new ArrayList<>();
        ar.findBypatientID(id).forEach(entity->{
            appointmentList.add(mapper.map(entity, Appointment.class));
        });
        return appointmentList;
    }

    @Override
    public List<Appointment> searchAppointmentByType(String type) {
        List<Appointment> appointmentList=new ArrayList<>();
        ar.findBytype(type).forEach(entity->{
            appointmentList.add(mapper.map(entity, Appointment.class));
        });
        return appointmentList;
    }
}
