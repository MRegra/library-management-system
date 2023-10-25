package com.core.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;

import java.util.Set;
import java.util.UUID;

/**
 * @author MRegra on 25/10/2023
 */
@Entity
@Table(name="lib_editor")
public class EditorEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    private String name;

    private String country;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_editor_uuid", nullable = false, referencedColumnName = "uuid")
    private Set<BookEntity> editedBooks;
}
