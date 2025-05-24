package dz.alaabo.auth_s.dto;

import lombok.Data;

@Data
public class TokenDTO {
    private String firstName;
    private String secondName;
    private String address;
    private String activeSSession;
    private String role;
}
