package com.deepesh.appointment.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // DB table name
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment ID
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true) // email must be unique
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING) // store enum as string 'ADMIN', 'PROVIDER', etc.
    @Column(nullable = false)
    private Role role;
}

