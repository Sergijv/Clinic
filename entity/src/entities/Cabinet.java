package entities;

import lombok.Data;

@Data
public class Cabinet {
    private Long id;
    private String speciality;
    private Long scheduleId;
}
