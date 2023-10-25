package com.core.library.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="lib_wishlist")
public class WishListEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;

    private Date addDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_wishlist_uuid", nullable = true, referencedColumnName = "uuid")
    private Set<BookEntity> wishListedBooks;
}
