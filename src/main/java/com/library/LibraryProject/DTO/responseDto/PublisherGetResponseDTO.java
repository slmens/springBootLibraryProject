package com.library.LibraryProject.DTO.responseDto;

import com.library.LibraryProject.entities.Book;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherGetResponseDTO {

    private long id;

    private String name;

    private String establishmentYear;

    private List<Book> bookList;

}