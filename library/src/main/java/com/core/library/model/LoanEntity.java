package com.core.library.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="lib_loan")
public class LoanEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name="loan_external_number",
            unique = true
    )
    private String loanExternalNumber;

    private Date startDate;

    private Date expirationDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_loan_uuid", nullable = true, referencedColumnName = "uuid")
    private Set<ReaderEntity> readers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_loan_uuid", nullable = true, referencedColumnName = "uuid")
    private Set<BookEntity> books;

}
