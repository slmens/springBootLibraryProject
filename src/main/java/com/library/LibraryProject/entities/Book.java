package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private int id;

    @Column(name = "book_name",nullable = false,length = 400)
    private String name;

    @Column(name = "book_publication_year",length = 25)
    private String publicationYear;

    @Column(name = "stock",length = 10)
    private int stock;
}
