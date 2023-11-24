package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.entities.BookBorrowing;
import com.library.LibraryProject.entities.Category;

public interface IBookBorrowingService {
    BookBorrowing getById(int id);
    BookBorrowing save(BookBorrowing bookBorrowing);
    void delete(BookBorrowing bookBorrowing);
    BookBorrowing update(BookBorrowing bookBorrowing);
}
