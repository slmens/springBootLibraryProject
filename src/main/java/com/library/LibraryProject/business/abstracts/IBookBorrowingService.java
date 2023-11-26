package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.DTO.requestDto.BookBorrowingSaveDTO;
import com.library.LibraryProject.entities.BookBorrowing;
import com.library.LibraryProject.entities.Category;

public interface IBookBorrowingService {
    BookBorrowing findById(long id);
    BookBorrowing save(BookBorrowingSaveDTO bookBorrowingSaveDTO);
    void delete(BookBorrowing bookBorrowing);
    BookBorrowing update(BookBorrowing bookBorrowing);
}
