package br.com.vizinhopet.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id", columnDefinition = "CHAR(36)")
    private String userId;

    @Column(name = "user_fullname", length = 100, nullable = false)
    private String userFullName;

    @Column(name = "date_birth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @Column(name = "phone_number", length = 15, nullable = false)
    private String phoneNumber;

    @Column(name = "wtsapp_number", length = 15)
    private String wtsappNumber;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "verified_badge")
    private boolean verifiedBadge;

    @Column(name = "cpf", length = 11, unique = true)
    private String cpf;
}
