package dz.alaabo.auth_s.security;

import dz.alaabo.auth_s.dto.UserDTO;
import lombok.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private long jwtExp;

    public String generateToken(UserDTO)
}
