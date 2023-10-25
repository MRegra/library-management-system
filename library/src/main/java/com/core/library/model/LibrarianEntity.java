package com.core.library.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="lib_librarian")
public class LibrarianEntity {

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
            name="librarian_external_number",
            unique = true
    )
    private String librarianExternalNumber;

    @ManyToMany(mappedBy = "librarians")
    @Column(name="loaned_books")
    private Set<BookEntity> loanedBooks;
}
