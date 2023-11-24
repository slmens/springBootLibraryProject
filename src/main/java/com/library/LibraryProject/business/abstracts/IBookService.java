package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.entities.Book;
import com.library.LibraryProject.entities.Category;

public interface IBookService {
    Book getById(int id);
    Book save(Book book);
    void delete(Book book);
    Book update(Book book);
}
