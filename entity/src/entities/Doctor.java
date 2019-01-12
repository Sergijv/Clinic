package entities;

import lombok.Data;

@Data
public class Doctor {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private Integer phone;
    private String speciality;
    private Long cabinetId;
}
