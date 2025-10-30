package br.com.vizinhopet.userservice.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id", columnDefinition = "CHAR(36)")
    private String userId;

    @Column(name = "user_fullname", length = 100, nullable = false)
    private String userFullName;

    @Column(name = "date_birth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @Column(name = "phone_number", length = 15, nullable = false)
    private String phoneNumber;

    @Column(name = "wtsapp_number", length = 15, nullable = false)
    private String wtsappNumber;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "verified_badge")
    private boolean verifiedBadge;

    @Column(name = "cpf", length = 11, unique = true)
    private String cpf;
}
