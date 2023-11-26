package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private long id;

    @NotBlank
    @Column(name = "author_name",length = 100,unique = true)
    private String name;

    @Column(name = "author_birth_date",length = 25)
    private String authorBirthDate;

    @Column(name = "author_origin_country",length = 100)
    private String origin;

    @OneToMany(mappedBy = "author",cascade = CascadeType.REMOVE)
    private List<Book> bookList;
}
