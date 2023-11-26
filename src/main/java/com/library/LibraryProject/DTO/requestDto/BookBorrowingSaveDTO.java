package com.library.LibraryProject.DTO.requestDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveDTO {

    private long id;

    @NotBlank
    private String borrowerName;

    @NotBlank
    @Email
    private String borrowerEmail;

    @NotBlank
    private String borrowingDate;

    @NotBlank
    private long bookId;
}
