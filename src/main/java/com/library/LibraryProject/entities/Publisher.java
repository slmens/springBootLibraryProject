package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "publishers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private long id;

    @NotBlank
    @Column(name = "publisher_name",length = 150,unique = true)
    private String name;

    @Column(name = "establishment_year",length = 25)
    private String establishmentYear;

    @NotBlank
    @Column(name = "address",length = 350)
    private String address;

    @OneToMany(mappedBy = "publisher",cascade = CascadeType.REMOVE)
    private List<Book> bookList;
}
