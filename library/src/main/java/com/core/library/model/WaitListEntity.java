package com.core.library.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="lib_waitlist")
public class WaitListEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    private boolean notify;

    private Date addedDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_waitlist_uuid", nullable = true, referencedColumnName = "uuid")
    private Set<ReaderEntity> waitListedReaders;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_waitlist_uuid", nullable = true, referencedColumnName = "uuid")
    private Set<BookEntity> waitListedBooks;
}
