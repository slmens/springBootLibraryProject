package com.library.LibraryProject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private long id;

    @NotBlank
    @Column(name = "book_name",length = 400,unique = true)
    private String name;

    @Column(name = "book_publication_year",length = 25)
    private String publicationYear;

    @Column(name = "stock",length = 10)
    private int stock;

    @ManyToOne()
    @JsonBackReference
    @JoinColumn(name = "book_author_id",referencedColumnName = "author_id")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JsonManagedReference
    @JoinTable(
            name = "book_categories",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;

    @ManyToOne()
    @JsonBackReference
    @JoinColumn(name = "book_publisher_id",referencedColumnName = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> bookBorrowings;
}
