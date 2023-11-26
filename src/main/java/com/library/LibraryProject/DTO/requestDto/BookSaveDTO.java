package com.library.LibraryProject.DTO.requestDto;

import com.library.LibraryProject.entities.Author;
import com.library.LibraryProject.entities.Category;
import com.library.LibraryProject.entities.Publisher;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveDTO {

    @NotBlank
    private String name;

    private String publicationYear;

    @NotBlank
    private int stock;

    private long author_id;

    @NotBlank
    private List<Long> category_ids;

    @NotBlank
    private long publisher_id;
}