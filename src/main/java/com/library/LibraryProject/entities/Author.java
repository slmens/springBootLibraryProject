package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private int id;

    @Column(name = "author_name",nullable = false,length = 100)
    private String name;

    @Column(name = "author_birth_date",length = 25)
    private String authorBirthDate;

    @Column(name = "author_origin_country",length = 100)
    private String origin;
}
