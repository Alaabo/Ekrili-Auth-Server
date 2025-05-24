package dz.alaabo.auth_s.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String email;
    private String password;
    private String activeSession;
}
