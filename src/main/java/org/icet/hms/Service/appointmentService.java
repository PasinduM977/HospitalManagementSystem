package org.icet.hms.Service;

import org.icet.hms.DTO.Appointment;

import java.util.List;

public interface appointmentService {
    void addAppintment(Appointment appointment);

    boolean deleteAppintment(Integer id);

    List<Appointment> searchAppointment();

    Appointment searchAppointmentByID(Integer id);

    List<Appointment> searchAppointmentByAdminID(Integer id);

    List<Appointment> searchAppointmentByPatientID(Integer id);

    List<Appointment> searchAppointmentByType(String type);
}
