package dz.alaabo.auth_s.security;

import dz.alaabo.auth_s.dto.TokenDTO;
import dz.alaabo.auth_s.dto.UserDTO;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {
    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private long jwtExp;

    public String generateToken(final TokenDTO user){

      return Jwts.builder()
              .setExpiration(new Date(System.currentTimeMillis() + jwtExp))
              .setIssuedAt(new Date())
              .signWith(Keys.hmacShaKeyFor(jwtSecret.getBytes()) , SignatureAlgorithm.HS512)
              .claim("firstName", user.getFirstName())
              .claim("secondName", user.getSecondName())
              .claim("address", user.getAddress())
              .claim("activeSSession", user.getActiveSSession())
              .claim("role", user.getRole())
              .setIssuer("auth-s")
              .compact();
    }

    

    private boolean isExpired(final String token) {
        return Jwts.parserBuilder()
                .setSigningKey(jwtSecret.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getExpiration()
                .before(new Date());
    }

    public boolean validateToken(final String token) {
        //TODO: implement validate token where we check if token is expired or not also we verify the signature and verify the session and verfiy the issuer
        return false;
    }
}
