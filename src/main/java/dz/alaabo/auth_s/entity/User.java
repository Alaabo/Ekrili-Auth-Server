package dz.alaabo.auth_s.entity;

import dz.alaabo.auth_s.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor @AllArgsConstructor
public class User extends  GenericEntity{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true , nullable = false)
    private String email;

    private String password;
    private String activeSSession;


    @Enumerated(EnumType.STRING)
    private Role role;
}
