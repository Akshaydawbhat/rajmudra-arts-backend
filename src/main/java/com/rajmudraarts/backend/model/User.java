package com.rajmudraarts.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;
    private String name;
    private String phone;
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role; // CUSTOMER or ADMIN
}
