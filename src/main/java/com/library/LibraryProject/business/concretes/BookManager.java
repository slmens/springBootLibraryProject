package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.business.abstracts.IBookService;
import com.library.LibraryProject.dao.BookRepository;
import com.library.LibraryProject.entities.Book;
import org.springframework.stereotype.Service;

@Service
public class BookManager implements IBookService {

    private final BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public Book update(Book book) {
        return null;
    }
}
