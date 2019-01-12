package entities;

import lombok.Data;

@Data
public class Schedule {
    private Long id;
    private String time;
    private Long doctorId;
    private Long patientId;
    private Long cabinetId;
}
