package com.library.LibraryProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "borrowings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id",columnDefinition = "serial")
    private int id;

    @Column(name = "borrower_name",nullable = false,length = 100)
    private String borrowerName;

    @Column(name = "borrower_email",nullable = false,length = 150)
    private String borrowerEmail;

    @Column(name = "borrowing_date",length = 25)
    private String borrowingDate;

    @Column(name = "return_date",length = 25)
    private String returnDate = null;
}
