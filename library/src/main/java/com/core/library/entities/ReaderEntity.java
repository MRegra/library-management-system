package com.core.library.entities;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * @author MRegra on 14/09/2023
 */
@Entity
@Table(name="lib_reader")
public class ReaderEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    private String name;

    @Column(
            unique = true
    )
    private String email;

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name="user_external_number",
            unique = true
    )
    private String userExternalNumber;
}
