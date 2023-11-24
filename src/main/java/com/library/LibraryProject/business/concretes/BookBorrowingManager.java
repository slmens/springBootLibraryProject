package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.business.abstracts.IBookBorrowingService;
import com.library.LibraryProject.dao.BookBorrowingRepository;
import com.library.LibraryProject.entities.BookBorrowing;
import org.springframework.stereotype.Service;

@Service
public class BookBorrowingManager implements IBookBorrowingService {

    private final BookBorrowingRepository bookBorrowingRepository;

    public BookBorrowingManager(BookBorrowingRepository bookBorrowingRepository) {
        this.bookBorrowingRepository = bookBorrowingRepository;
    }


    @Override
    public BookBorrowing getById(int id) {
        return null;
    }

    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return null;
    }

    @Override
    public void delete(BookBorrowing bookBorrowing) {

    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        return null;
    }
}
