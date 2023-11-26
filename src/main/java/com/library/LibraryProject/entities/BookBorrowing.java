package com.library.LibraryProject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    private long id;

    @NotBlank
    @Column(name = "borrower_name",length = 100)
    private String borrowerName;

    @NotBlank
    @Email
    @Column(name = "borrower_email",length = 150)
    private String borrowerEmail;

    @NotBlank
    @Column(name = "borrowing_date",length = 25)
    private String borrowingDate;

    @Column(name = "return_date",length = 25)
    private String returnDate = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "book_id")
    private Book book;
}
