package org.icet.hms.Controller;

import lombok.RequiredArgsConstructor;
import org.icet.hms.DTO.Appointment;
import org.icet.hms.Service.appointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Appointment")
@RequiredArgsConstructor
public class appointmentController {

    final appointmentService as;

    @PostMapping("/addAppointment")
    public void saveAppointment(@RequestBody Appointment appointment)
    {
        as.addAppintment(appointment);
    }

    @PutMapping("/updateAppointment")
    public void updateAppointment(@RequestBody Appointment appointment)
    {
        as.addAppintment(appointment);
    }

    @DeleteMapping("/deleteAppointment/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Boolean deleteAppointment(@PathVariable Integer id)
    {
        boolean isDeleted=as.deleteAppintment(id);
        return  isDeleted;
    }

    @GetMapping("/searchAll")
    public List<Appointment> searchAppointment()
    {
       return  as.searchAppointment();
    }

    @GetMapping("/searchByID/{ID}")
    public Appointment searchAppointmentByID(@PathVariable Integer ID)
    {
        return  as.searchAppointmentByID(ID);
    }

    @GetMapping("/searchByAdminID/{ID}")
    public List<Appointment> searchAppointmentByAdminID(@PathVariable Integer ID)
    {
        return  as.searchAppointmentByAdminID(ID);
    }

    @GetMapping("/searchByPatientID/{ID}")
    public List<Appointment> searchAppointmentBypatientID(@PathVariable Integer ID)
    {
        return  as.searchAppointmentByPatientID(ID);
    }

    @GetMapping("/searchByType/{type}")
    public List<Appointment> searchAppointmentByType(@PathVariable String type)
    {
        return  as.searchAppointmentByType(type);
    }
}
