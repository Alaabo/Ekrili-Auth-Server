package dz.alaabo.auth_s.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String email;
    private String password;
    private String activeSession;
    private String firstName;
    private String secondName;
    private String address;
    private String phone;
    private String role;
}
