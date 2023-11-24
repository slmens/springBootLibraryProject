package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "publishers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private int id;

    @Column(name = "publisher_name",nullable = false,length = 150)
    private String name;

    @Column(name = "establishment_year",length = 25)
    private String establishmentYear;

    @Column(name = "address",length = 350)
    private String address;
}
