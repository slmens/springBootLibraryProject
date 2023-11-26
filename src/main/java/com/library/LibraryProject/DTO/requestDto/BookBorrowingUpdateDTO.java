package com.library.LibraryProject.DTO.requestDto;

import com.library.LibraryProject.entities.Book;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingUpdateDTO {

    private long id;

    private String borrowerName;

    private String borrowingDate;

    private String returnDate;
}