package com.core.library.model;

import com.core.library.commons.Language;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * @author MRegra on 14/09/2023
 */
@Entity
@Table(name="lib_book")
public class BookEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID uuid;
    private String title;
    private String ISBN;
    private Date publicationDate;
    private Language language;
    private int pages;
    private String author;
    private int shelf;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "lib_book_category_rel",
            joinColumns = @JoinColumn(name = "book_uuid", referencedColumnName = "uuid"),
            inverseJoinColumns = @JoinColumn(name = "category_uuid", referencedColumnName = "uuid"))
    private Set<CategoryEntity> categories;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "lib_book_author_rel",
            joinColumns = @JoinColumn(name = "book_uuid", referencedColumnName = "uuid"),
            inverseJoinColumns = @JoinColumn(name = "author_uuid", referencedColumnName = "uuid"))
    private Set<AuthorEntity> authors;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "lib_book_librarian_rel",
            joinColumns = @JoinColumn(name = "book_uuid", referencedColumnName = "uuid"),
            inverseJoinColumns = @JoinColumn(name = "librarian_uuid", referencedColumnName = "uuid"))
    private Set<LibrarianEntity> librarians;

    public BookEntity() {
    }

    public BookEntity(UUID uuid,
                      String title,
                      String ISBN,
                      Date publicationDate,
                      Language language,
                      int pages,
                      String author,
                      Set<CategoryEntity> categories,
                      int shelf) {
        this.uuid = uuid;
        this.title = title;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.language = language;
        this.pages = pages;
        this.author = author;
        this.categories = categories;
        this.shelf = shelf;
    }

    public BookEntity(String title,
                      String ISBN,
                      Date publicationDate,
                      Language language,
                      int pages,
                      String author,
                      Set<CategoryEntity> categories,
                      int shelf) {
        this.title = title;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.language = language;
        this.pages = pages;
        this.author = author;
        this.categories = categories;
        this.shelf = shelf;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public Set<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryEntity> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + uuid +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publicationDate=" + publicationDate +
                ", language=" + language +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                //", themes=" + themes +
                ", shelf=" + shelf +
                '}';
    }
}
