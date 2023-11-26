package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.DTO.requestDto.BookSaveDTO;
import com.library.LibraryProject.entities.Book;
import com.library.LibraryProject.entities.Category;

public interface IBookService {
    Book findById(long id);
    Book save(BookSaveDTO bookSaveDTO);
    void delete(Book book);
    Book update(Book book);
}
