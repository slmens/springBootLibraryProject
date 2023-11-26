package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",columnDefinition = "serial")
    private long id;

    @NotBlank
    @Column(name = "category_name",length = 100,unique = true)
    private String name;

    @Column(name = "category_desc",length = 1500)
    private String categoryDesc;

    @ManyToMany(mappedBy = "categoryList",cascade = CascadeType.REMOVE)
    private List<Book> bookList;

}
