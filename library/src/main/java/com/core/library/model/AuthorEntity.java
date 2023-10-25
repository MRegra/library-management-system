package com.core.library.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

/**
 * @author MRegra on 14/09/2023
 */
@Entity
@Table(name="lib_author")
public class AuthorEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    private String name;

    private String nationality;

    @ManyToMany(mappedBy = "authors")
    private Set<BookEntity> books;
}
