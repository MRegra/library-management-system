package com.core.library.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="lib_category")
public class CategoryEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    @Column(
            unique=true,
            name="category"
    )
    private String categoryName;

    @ManyToMany(mappedBy = "categories")
    private Set<BookEntity> books;
}
