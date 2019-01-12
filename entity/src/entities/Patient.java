package entities;

import lombok.Data;

@Data
public class Patient {
        private Long id;
        private String name;
        private String email;
        private String password;
        private Integer phone;
        private String address;
        private Long scheduleId;
}
